package com.itheima01_static.p02开发中的应用;

/*
1.开发中为了便于使用,会将一些全局使用的变量或方法，在一个类中定义为静态，通过类名快速调用，这样的类称为工具类。
2.完成步骤：
	在工具类中定义静态变量和静态方法
	通过类名使用全局变量
	通过类名使用全局方法

需求:在一个工具类中，定义一个π变量和获取数组最大值方法
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = Util.getMax(arr);
        System.out.println(max);

    }
}

