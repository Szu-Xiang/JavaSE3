package com.itheima02_Extends.p06继承体系内存;

/*
1.子类在创建对象的时候，会先初始化父类的内容，再初始化子类的内容。
2.父类的内容，会在子类对象的内存中，开辟一个独立空间，进行存储，并通过super指向这个空间。
3.父类内容初始化完成，子类的内容，会直接在开辟的内存中进行存储。

*/
public class Test {
    public static void main(String[] args) {
        //创建一个子类对象
        ZiToMemory zi = new ZiToMemory();
        //使用子类对象调用show方法
        zi.show();
        //使用子类对象调用method方法
        zi.method();
    }
}





