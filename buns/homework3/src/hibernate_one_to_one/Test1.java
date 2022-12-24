package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {

            session = factory.getCurrentSession();
            Employee employee = new Employee("Mikhail", "Dostovalov",
                    "IT", 500);
            Detail detail = new Detail("Ekb", "235252", "sdgsf@mail.ru");

            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);
            session.getTransaction().commit();

            System.out.println("Done insert!");



//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov",
//                    "Sales", 450);
//            Detail detail = new Detail("Msk", "744646", "ssdfsgsdf@mail.ru");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();
//
//            System.out.println("Done insert!");



//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 10);
//
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 2);
//            System.out.println(emp.getEmpDetail());
//
//            session.delete(emp);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }

    }
}
