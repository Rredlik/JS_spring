package com.example.buns.homework2;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Book taken from the UniLibrary\n");
    }

    public String returnBook(){
        int a = 10 / 0;
        System.out.println("Returning the book to the UniLibrary\n");
        return "Униженные и оскорбленные";
    }

    public void getMagazine(){
        System.out.println("Journal taken from the UniLibrary\n");
    }

    public void returnMagazine(){
        System.out.println("Returning the journal to the UniLibrary\n");
    }

    public void addBook(String personName, Book book){
        System.out.println("Add the book to the UniLibrary\n");
    }

    public void addMagazine(){
        System.out.println("Add the journal to the UniLibrary\n");
    }
}
