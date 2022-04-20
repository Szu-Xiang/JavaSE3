package com.itheima03_多态.p02多态时访问特点;

/*
多态时访问特点
    访问格式:
        对象名.成员变量名;
        对象名.方法名();
    访问特点
        成员变量:编译看左边,运行看左边  (编译时看父类,运行时找父类)
        成员方法:编译看左边,运行看右边  (编译时看父类,运行时找子类)
        静态方法:编译看左边,运行看左边  (编译时看父类,运行时找父类)
 */
public class Test {
    public static void main(String[] args) {

        //多态场景下的访问规则
        Fu f = new Zi();
        //1.成员变量
        System.out.println(f.num);//运行看左边，num = 10
        //System.out.println(f.num2);//报错

        //2.成员方法(*) 编译看左边，运行看右边
        f.method();//运行看右边，子类的method


        //3.静态方法
        f.staticMethod();

    }
}

