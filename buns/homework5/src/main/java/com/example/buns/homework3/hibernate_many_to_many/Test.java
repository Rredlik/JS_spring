package com.example.buns.homework3.hibernate_many_to_many;

import com.example.buns.homework3.hibernate_many_to_many.entity.Child;
import com.example.buns.homework3.hibernate_many_to_many.entity.Section;
import com.example.buns.homework3.hibernate_one_to_many_uni.entity.Department;
import com.example.buns.homework3.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                .configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Child.class)
                                .addAnnotatedClass(Section.class)
                                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("Grisha", 8);
//            Child child3 = new Child("Pavlik", 9);
//
//            section1.addChild(child1);
//            section1.addChild(child2);
//            section1.addChild(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//            child1.addSection(section1);
//            child1.addSection(section2);
//            child1.addSection(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 8);
//            session.delete(section);
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            Scanner in = new Scanner(System.in);

            Section section = new Section(in.nextLine());

            String[] dataChild = in.nextLine().split(" ");
            Child child = new Child(dataChild[0], Integer.parseInt(dataChild[1]));

            section.addChild(child);

            session.beginTransaction();

            session.persist(section);

            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();

            Child child1 = session.get(Child.class, 4);

            System.out.println(child1);

            session.delete(child1);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
