package com.itheima02_接口.p01接口入门;

public class MyInterImpl implements MyInter {

    @Override
    public void abstractMethod() {
        System.out.println("重写的抽象方法");
    }

    public void defaultMethod2() {

        System.out.println("重写的默认方法");
    }

    //静态方法不存在继承关系
    public static void staticMethod() {

    }
}
