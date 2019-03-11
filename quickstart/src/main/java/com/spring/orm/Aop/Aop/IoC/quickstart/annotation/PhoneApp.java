package com.spring.orm.Aop.Aop.IoC.quickstart.annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class PhoneApp {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(PhoneApp.class);
        Phone phone=context.getBean(Phone.class);
        System.out.println(phone);
    }
}
