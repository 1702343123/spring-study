package com.spring.Aop;

public class TankProxy implements Move {
    private Move t;

    public TankProxy(Move t) {
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("start");
        t.move();
        System.out.println("stop");
    }
}
