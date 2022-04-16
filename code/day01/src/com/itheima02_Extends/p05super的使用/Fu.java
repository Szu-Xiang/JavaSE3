package com.itheima02_Extends.p05super的使用;

public class Fu {
    int num = 10;

    public Fu() {
        System.out.println("父类的无参构造方法");
    }

    public Fu(int num) {
        System.out.println("父类的有参构造方法");
        this.num = num;
    }

    public void method() {
        System.out.println("父类的method方法");
    }
}
