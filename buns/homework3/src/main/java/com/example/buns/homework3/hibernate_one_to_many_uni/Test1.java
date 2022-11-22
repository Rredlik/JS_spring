package com.example.buns.homework3.hibernate_one_to_many_uni;

import com.example.buns.homework3.hibernate_one_to_many_uni.entity.Department;
import com.example.buns.homework3.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("HR", 1500, 500);
//            Employee emp1 = new Employee("Oleg", "Ivanon", 800);
//            Employee emp2 = new Employee("Andrey", "Sidorov", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            Scanner in = new Scanner(System.in);

            String[] dataDet = in.nextLine().split(" ");
            Department department1 = new Department(dataDet[0], Integer.parseInt(dataDet[1]), Integer.parseInt(dataDet[2]));

            String[] dataEmp = in.nextLine().split(" ");
            Employee employee = new Employee(dataEmp[0], dataEmp[1], Integer.parseInt(dataEmp[2]));

            department1.addEmployeeToDepartment(employee);

            session.beginTransaction();

            session.save(department1);

            session.getTransaction().commit();

            Department department = session.get(Department.class, 2);

            System.out.println(department);

            session.delete(department);

            session.getTransaction().commit();
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
