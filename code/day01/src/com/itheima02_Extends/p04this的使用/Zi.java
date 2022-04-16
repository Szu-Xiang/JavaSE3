package com.itheima02_Extends.p04this的使用;

public class Zi extends Fu {

    int num = 30;

    @Override
    public void show() {
        int num = 20;
        System.out.println(num);
        System.out.println(this.num);
        super.method();
    }

    @Override
    public void method() {
        super.method();
        System.out.println("子类的method方法");
    }


}
