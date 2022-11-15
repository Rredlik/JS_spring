package com.example.buns.homework2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Mikhail Dostovalov", 3, 4.8);
        Student st2 = new Student("Ivan Ivanov", 4, 4.95);
        Student st3 = new Student("Dmitry Slovtsov", 1, 2.34);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("\nStarts method getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
