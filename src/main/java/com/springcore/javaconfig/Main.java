package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
        Emp ep1=context.getBean("student",Emp.class);
        System.out.println(ep1);
        Emp.work();
    }


}
