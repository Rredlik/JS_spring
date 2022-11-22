package com.example.buns.homework3.hibernate_one_to_many_bi;

import com.example.buns.homework3.hibernate_one_to_many_bi.entity.Department;
import com.example.buns.homework3.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
//            Department dep = new Department("Sales", 1500, 800);
//            Employee emp1 = new Employee("Kirill", "Dmitriev", 800);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1500);
//            Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            System.out.println("Get department");
//            Department department = session.get(Department.class, 3);
//            System.out.println("Show department");
//            System.out.println(department);
//            System.out.println("Show emps department");
//            System.out.println(department.getEmps());
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

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee1 = session.get(Employee.class, 1);
            System.out.println(employee1);

            session.getTransaction().commit();
        }
        finally {
            assert session != null;
            session.close();
            factory.close();
        }
    }
}
