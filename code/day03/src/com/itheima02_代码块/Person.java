package com.itheima02_代码块;

public class Person {

    final int NUM;

    {
        //构造方法中执行的语句，可以直接放在构造代码块里。
        NUM = 10;
        System.out.println("Person构造代码块");
    }

    static {
        System.out.println("Person静态代码块");
    }

    public Person() {
        //构造代码块 > 无参构造方法
        System.out.println("Person的无参构造");
    }
}
