package type_of_downloads.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import type_of_downloads.hibernate_one_to_many_bi.entity.*;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        session = factory.getCurrentSession();

        try {
            session.beginTransaction();

//            Department department = new Department("Sales", 500, 1500);
//
//            Employee emp1 = new Employee("Mikhail", "Dostovalov", 1500);
//            Employee emp2 = new Employee("Elena", "Smirnova", 1200);
//            Employee emp3 = new Employee("Vladislav", "Sapozhnikov", 500);

//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);

//            session.save(department);
//            session.getTransaction().commit();



            System.out.println("Get department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Show employees of the department");
            System.out.println(department.getEmpls());

            session.getTransaction().commit();




//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);
//
//            session.getTransaction().commit();


        }

        finally {
            session.close();
            factory.close();
        }

    }

}
