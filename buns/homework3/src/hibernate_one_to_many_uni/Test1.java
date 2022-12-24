package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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

        session = factory.getCurrentSession();

        try {
            session.beginTransaction();


//            Department dep = new Department("HR",
//                    500, 1500);
//
//            Employee emp1 = new Employee("Oleg", "Ivanov", 1500);
//            Employee emp2 = new Employee("Andrey", "Sigorov", 800);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done insert!");




//            Department department = session.get(Department.class, 2);
////            Employee employee = session.get(Employee.class, 2);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
////            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done insert!");


            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }

    }
}
