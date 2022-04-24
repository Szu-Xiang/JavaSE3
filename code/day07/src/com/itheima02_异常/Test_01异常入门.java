package com.itheima02_异常;

/*
1.概述
	异常指程序在执行过程中,出现的状况。
	java中默认将异常交给jvm，jvm处理异常方式，即结束虚拟机,中断运行，见《异常传递图解》。
	在Java等面向对象的编程语言中，将异常问题，用指定的类来表示，并提供一定的处理办法。
2.异常结构:见《异常的体系》
	编译时(checked)异常：编译时期，被检查的异常,需明确处理方式,否则编译失败。(如日期格式化异常)
	运行时(runtime)异常：编译时期，默认被声明的异常，运行时期出现问题,若没被处理则比则编译失败。(如数学异常)
3.异常关键字
	throw：抛出		手动抛出异常类的实例化对象，即产生异常。
	throws：声明	声明方法中存在的一个或多个异常类型，即交个调用者处理。
	try：尝试		与catch或finally结合使用。只有try中被检查的的代异才可以被catch处理。
	catch：捕捉		与try结合使用，捕捉try代码块中可能存在的一个或多个异常
	finally：最终	与try结合使用，用于执行try中内容执行后，一定要执行的操作；

需求:在测试类中通过演示ArrayIndexOfBoundsException(数组索引越界异常)异常，分析异常的产生与传递过程


 */
public class Test_01异常入门 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3};
        //调用方法，获取元素
        int ele = getElement(arr, 2);
        System.out.println(ele);
    }

    public static int getElement(int[] arr, int index) {
        int num = arr[index];
        return num;

    }
}
