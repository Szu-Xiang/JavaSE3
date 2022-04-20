package com.itheima03_常用API;

/*
1.概述:
    java.lang.System 可以获取与系统相关的信息或系统级操作的工具类
    System类构造方法被私有修饰，不能创建对象，通过类名调用内部静态内容即可。
2.常用方法:
    public static void exit(int status)    终止当前运行的Java虚拟机，非零表示异常终止
    public static long currentTimeMillis() 返回当前时间(以毫秒为单位)

 */
public class Test_06System {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        doSomeThing();

        long endTime = System.currentTimeMillis();

        long time = endTime - startTime;

        System.out.println(time + "毫秒");

    }

    public static void doSomeThing() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("nihao");
        }
    }

}
