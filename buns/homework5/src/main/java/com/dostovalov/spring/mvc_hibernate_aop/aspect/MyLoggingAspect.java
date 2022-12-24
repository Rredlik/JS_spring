package com.dostovalov.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.annotation.*;
public class MyLoggingAspect {

    @Around
    public Object aroundAllRepositoryMethodsAdvice()  throws Throwable {
        return null;
    }
}
