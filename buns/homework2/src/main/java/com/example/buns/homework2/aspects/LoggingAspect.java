package com.example.buns.homework2.aspects;

import com.example.buns.homework2.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeGetBookAdvice: taking book...\n");
    }

    @Before("com.example.buns.homework2.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj : arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Book: Name - " + myBook.getName()
                    + ", author - " + myBook.getAuthor() + ", year - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof  String){
                    System.out.println(obj + " adds a book");
                }
            }
        }
        System.out.println("beforeGetBookAdvice: logging attempt of take a book\n");
    }

}
