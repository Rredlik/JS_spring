package com.example.buns.homework3.hibernate_one_to_one;

import com.example.buns.homework3.hibernate_one_to_one.entity.Detail;
import com.example.buns.homework3.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Employee.class)
                                .addAnnotatedClass(Detail.class)
                                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Vasya", "Petrov", "Sales", 560);
//            Detail detail = new Detail("Perm", "87635143987", "vasyapet@gmail.com");
//
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);

            session.delete(detail);
            session.getTransaction().commit();
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
