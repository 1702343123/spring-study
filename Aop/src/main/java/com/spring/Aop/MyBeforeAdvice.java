package com.spring.Aop;

/**
 * 用户自定义的前置增强类
 */
public class MyBeforeAdvice {
//    定义前置方法
    public void beforeMethod(){
        System.out.println("this is a before method");
    }
}
