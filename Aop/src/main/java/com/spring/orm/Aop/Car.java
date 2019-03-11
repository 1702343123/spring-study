package com.spring.orm.Aop;

public class Car implements Move {
    @Override
    public void move() {
        System.out.println("Car is moving...");
    }
}
