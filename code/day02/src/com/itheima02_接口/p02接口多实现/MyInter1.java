package com.itheima02_接口.p02接口多实现;

public interface MyInter1 {
    public static final int NUM = 10;

    public abstract void abstractMethod();

    public default void defaultMethod() {

        System.out.println("我是一个默认方法A");
    }

    //静态方法
    public static void staticMethod() { //static不可以省略

        System.out.println("我是一个静态方法A");
    }
}
