package com.dostovalov.spring.springboot.homework8.controller;


import com.dostovalov.spring.springboot.homework8.entity.Employee;
import com.dostovalov.spring.springboot.homework8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    //контроллер, управлеющий рест запросами и ответами
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private final EmployeeService employeeService;

    public MyRESTController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployee = employeeService.getAllEmployees();
        return allEmployee;
    }

//    @GetMapping("/employees/{id}")   //получаем id из самого url адреса
//    public Employee getEmployee(@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//
//
//        return employee;
//    }
//
//    //@PostMapping - откловка POST запроса
//    //@RequestBody - параметр из "тела запроса"
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//
//        return employee;
//    }
//
//    //@PutMapping  - откловка PUT запроса
//    //@RequestBody - параметр из "тела запроса"
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.saveEmployee(employee);
//
//        return employee;
//    }
//
//    //@DeleteMapping  - откловка DELETE запроса
//    //@RequestBody    - параметр из "тела запроса"
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        Employee employee = employeeService.getEmployee(id);
//
//
//        employeeService.deleteEmployee(id);
//        return "Employee with ID = " + id + " was deleted";
//    }
}