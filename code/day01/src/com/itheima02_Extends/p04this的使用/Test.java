package com.itheima02_Extends.p04this的使用;

/*
1.就近原则
    变量在使用的时候，优先使用定义的近的变量，谁离得近就指向哪个变量
2.this作用
    表示存储“当前对象”的引用
    this指向的内容，可以理解为访问本类中的内容。
3.三种格式
    this.成员变量		访问本类成员变量
    this.成员方法名()	访问本类成员方法
    this(...)		访问本类构造方法

 */
public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        //z.method();


    }
}

