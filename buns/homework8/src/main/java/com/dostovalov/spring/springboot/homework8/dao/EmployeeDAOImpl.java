package com.dostovalov.spring.springboot.homework8.dao;

import com.dostovalov.spring.springboot.homework8.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private final EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("from Employee", Employee.class);

        List<Employee> allEmployees = query.getResultList();

        return allEmployees;
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(employee);
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, id);
//
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee where id =:empID");
//        query.setParameter("empID", id);
//        query.executeUpdate();
//    }
}