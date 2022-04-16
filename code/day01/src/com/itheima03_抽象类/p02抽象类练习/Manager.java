package com.itheima03_抽象类.p02抽象类练习;

public class Manager extends Employee{
    public Manager(){

    }

    @Override
    public void work() {
        System.out.println("Managing~");
    }

    public Manager(String id, String name, int salary) {
        super(id, name, salary);
    }
}
