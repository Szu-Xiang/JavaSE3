package com.itheima02_接口.p01接口入门;

public interface MyInter {
    public static final int NUM = 10;//完整格式，可以省略public static final

    public abstract void abstractMethod();//完整格式，可以省略public abstra

    public default void defaultMethod() { //不可以省略

        System.out.println("我是一个默认方法");
    }

    //静态方法
    public static void staticMethod() { //static不可以省略
        System.out.println("我是一个静态方法");
    }
}
