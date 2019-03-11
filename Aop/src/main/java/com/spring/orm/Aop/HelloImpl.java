package com.spring.orm.Aop;

public class HelloImpl implements Hello {
    @Override
    public String getHello() {
        return "Hello,Spring AOP";
    }
}
