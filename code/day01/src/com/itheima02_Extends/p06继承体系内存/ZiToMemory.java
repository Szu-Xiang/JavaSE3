package com.itheima02_Extends.p06继承体系内存;

public class ZiToMemory extends FuToMemory {
    public ZiToMemory() {
        super();
    }

    int num = 20;

    public void show() {
        int num = 30;
        System.out.println("访问局部变量:" + num);
        System.out.println("访问成员变量:" + this.num);
        System.out.println("访问父类成员变量:" + super.num);
    }

    public void method() {
        super.method();
        System.out.println("子类中的method方法");
    }
}
