package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

//
//            Department dep = new Department("IT",
//                    300, 1200);
//
//            Employee emp1 = new Employee("Mikhail", "Dostovalov", 1000);
//            Employee emp2 = new Employee("Elena", "Olegovna", 700);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done insert!");




//            Department department = session.get(Department.class, 1);
            Employee employee = session.get(Employee.class, 2);


            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done insert!");


        }
        finally {
            session.close();
            factory.close();
        }

    }
}
