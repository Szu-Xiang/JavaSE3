package com.itheima01_Generic;

public class GenericMethod {
    //泛型作为形参
    public <BYD>void method1(BYD byd) {
        System.out.println(byd);
    }

    //泛型作为返回值类型
    public <BYD> BYD method2() {
        //将来的泛型必须是String类型，否则会出现异常
        BYD byd = (BYD) "abc";
        return byd;
    }
}
