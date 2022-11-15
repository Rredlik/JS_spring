package com.example.buns.homework2.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* edit*(..))")
    public void allAddMethods() {}
}
