package com.itheima03_多态.p02多态时访问特点;

public class Zi extends Fu {
    //与父类同名的内容
    int num = 666;

    public void method() {

        System.out.println("子类中的method方法");
    }

    public static void staticMethod() {
        System.out.println("子类中的staticMethod方法");
    }

    //子类特有的内容
    int num2 = 999;

    public void method2() {

        System.out.println("子类中的method2方法");
    }

    public static void staticMethod2() {

        System.out.println("子类中的staticMethod2方法");
    }
}
