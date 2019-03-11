package com.spring.Aop.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2019/3/4.
 */
public class MaxApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("/beans.xml");
        Max max= (Max) context.getBean("max");
        System.out.println(max.getMax());
    }
}
