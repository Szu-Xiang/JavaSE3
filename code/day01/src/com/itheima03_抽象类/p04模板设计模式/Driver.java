package com.itheima03_抽象类.p04模板设计模式;

public abstract class Driver {

    public void open() {
        System.out.println("开门");
    }

    public void fire() {
        System.out.println("点火");
    }

    public abstract void posture();

    public void stop() {
        System.out.println("刹车");
    }

    public void close() {
        System.out.println("熄火");
    }

    public void drive() {
        open();
        fire();
        posture();
        stop();
        close();
    }
}
