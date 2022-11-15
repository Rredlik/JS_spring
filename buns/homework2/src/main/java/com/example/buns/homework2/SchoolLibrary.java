package com.example.buns.homework2;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    //@Override
    public void getBook(){
        System.out.println("Book taken from SchoolLibrary");
    }
}
