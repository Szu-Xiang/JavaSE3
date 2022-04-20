package com.itheima02_接口.p03继承并实现;

/*
1.介绍:实现类可以在继承一个类的同时，实现多个接口。
2.实现格式:[ ]表示可选操作
    public [abstract] public  class 类名 [extends 父类名] implements 接口名1,接口名2,接口名3... {
        // 重写接口中抽象方法【必须】
        // 重写接口中默认方法【不重名时可选,重名时优先使用父类的】
    }
3.同名成员使用特点
    静态常量  只能通过所在接口名和类名调用。
    抽象方法  同多实现。
    (成员/默认)方法  子类优先继承及使用类中的成员方法
    静态方法        子类优先使用父类中的静态方法，且可以不通过所在类名调用。

 */
public class Test {

    public static void main(String[] args) {
        //同名内容的访问规则
        Zi z = new Zi();
        //1.静态常量
        System.out.println(Fu.NUM);//889
        System.out.println(MyInter.NUM);//999


        //2.抽象方法
        z.abstractMethod();

        //3.成员/默认方法
        z.defaultMethod();//优先继承父类的成员方法

        //4.静态方法
        //优先拥有父类的静态方法，且可以通过子类对象调用
        //虽然可以使用，但是这仅仅是一种特殊的用法，一种设计上的缺陷
        z.staticMethod();


    }
}
