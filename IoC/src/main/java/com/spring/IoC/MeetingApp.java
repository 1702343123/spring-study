package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/3/4.
 */
public class MeetingApp{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Meeting meeting=context.getBean(Meeting.class);
        System.out.println(meeting);
    }

}

