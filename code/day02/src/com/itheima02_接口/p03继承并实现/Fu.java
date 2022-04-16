package com.itheima02_接口.p03继承并实现;

public abstract class Fu {
    public static final int NUM = 889;

    public abstract void abstractMethod();

    //成员方法
    public void defaultMethod() {

        System.out.println("我是一个父类中的成员方法A");
    }

    //静态方法
    public static void staticMethod() { //static不可以省略

        System.out.println("我是一个父类静态方法A");
    }
}
