package com.itheima03_多态.p03多态表现形式;

import com.itheima02_接口.p03继承并实现.Zi;

/*
多态的3中表现形式
    普通父类引用指向子类对象
    抽象父类引用指向子类对象
    父接口引用指向实现类对象

 */
public class Test {
    public static void main(String[] args) {

        //普通父类引用指向子类对象
        Fu1 f1 = new Zi1();
        f1.method();

        //抽象父类引用指向子类对象
        Fu2 f2 = new Zi2();
        f2.method();

        //父接口引用指向实现类对象
        Fu3 f3 = new Zi3();
        f3.method();
    }
}

