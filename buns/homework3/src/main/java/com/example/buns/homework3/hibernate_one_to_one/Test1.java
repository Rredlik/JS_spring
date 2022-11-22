package com.example.buns.homework3.hibernate_one_to_one;

import com.example.buns.homework3.hibernate_one_to_one.entity.Detail;
import com.example.buns.homework3.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Employee.class)
                                .addAnnotatedClass(Detail.class)
                                .buildSessionFactory();
        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Alex", "Buganov", "IT", 1000);
//            Detail detail = new Detail("Yekaterinburg", "88005553535", "albug@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Saler", 700);
//            Detail detail = new Detail("Moscow", "89507567821", "olegsmirn@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();

            Scanner in = new Scanner(System.in);
            String[] dataEmp = in.nextLine().split(" ");

            Employee employee = new Employee(dataEmp[0], dataEmp[1], dataEmp[2], Integer.parseInt(dataEmp[3]));
            String[] dataDet = in.nextLine().split(" ");
            Detail detail = new Detail(dataDet[0], dataDet[1], dataDet[2]);
            employee.setEmpDetail(detail);

            session.save(employee);

            Employee emp = session.get(Employee.class, 2);
            System.out.println(emp.getEmpDetail());
            session.delete(emp);


            session.getTransaction().commit();
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
