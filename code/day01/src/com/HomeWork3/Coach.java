package com.HomeWork3;

public class Coach extends Person{

    //空参构造
    public Coach(){

    }

    public Coach(String id, String name, String gender, int age) {
        super(id, name, gender, age);
    }


    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }


    public String toString() {
        return "Coach{}";
    }
}
