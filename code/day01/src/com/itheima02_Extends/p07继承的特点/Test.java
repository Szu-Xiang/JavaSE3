package com.itheima02_Extends.p07继承的特点;
/*
1.单继承
	类与类之间只能单继承，不能多继承
2.多层继承
	类与类之间可以多层继承
3.多个子类
	同一个父类可以拥有多个子类
 */

public class Test {

    public static void main(String[] args) {
        //支持多层继承
        C c = new C();
        System.out.println(c.num);
    }

}


