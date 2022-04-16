package com.itheima04_final;

/*
概述
    1.作用
    	Java提供了final 关键字，用于修饰不可改变内容。
    2.应用
    	修饰类:被修饰的类，不能被继承(例如:String类、Math类、Scanner类...)。
    	修饰方法:被修饰的方法，不能被重写。
    	修饰变量:被修饰的变量，一旦赋值,不能被重新赋值。
final的使用
    1.修饰类:
    	格式:public final public  class 类名 {  //类中成员 }
    2.修饰方法:
    	格式:public final 返回值类型 方法名(){}
    3.修饰变量
    	格式:final 数据类型 变量名=值;  或  final 数据类型 变量名; 变量名=值;
    	注意事项:
    	    	被final修饰的常量，被称为自定义常量(所有字母都大写)。
        		修饰的如果是成员变量，可以不直接赋值，但需要保证所有构造方法有赋值操作

 */
public class Test {
    public static void main(String[] args) {

    }
}

