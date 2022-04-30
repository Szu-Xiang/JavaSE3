package com.itheima02_Lambda;

/*
1.概述
	JDK8开始一个新语法。它是一种“代替语法”。
	Lambda表达式,简化对于接口实现类对象实现 ，本质是一个匿名内部类的简易实现。
2.编程思想
	“面向对象”的编程思想:必须依靠对象,通过对象调用方法来完成功能
        		例如:使用线程的步骤：
 			方式1:①定义Runnable实现类②创建实现类对象③传入实现类对象；
 			方式2:匿名内部类
	“面向过程”-->函数式编程思想：在写法上要比较简洁，注重代码的实现过程。
        		例如:使用线程的步骤：不需要定义实现类;不需要创建具体的子类对象;只需要传入一个“方法”即可。
需求:通过Runnable做100次循环遍历，演示匿名内部类、函数式编程的实现效果。
*/

public class Test_01_Lambda入门 {
    public static void main(String[] args) {

        //需求：使用匿名内部类的形式，创建并启动线程对象
        new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类实现");
            }
        })).start();


        //lambda形式，面向过程思想
        new Thread(()->{
            System.out.println("lambda的形式实现");
        }).start();
    }
}
