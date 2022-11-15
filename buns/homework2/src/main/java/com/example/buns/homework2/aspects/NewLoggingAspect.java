package com.example.buns.homework2.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: trying to return the book to the library...");

        Object targetMethodResult = null;
        try{
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.out.println("[ERROR] aroundReturnBookLoggingAdvice: " + e);
            targetMethodResult = "Unknown name of book";
        }


        System.out.println("aroundReturnBookLoggingAdvice: the book was successfully returned");

        return targetMethodResult;
    }
}
