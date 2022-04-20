package com.itheima03_多态.p05类型转换;

public class Cat extends Animal {

    @Override
    public void eat() {

        System.out.println("Cat eats Fish");
    }

    public void catchMouse() {

        System.out.println("猫抓老鼠");
    }
}