package com.itheima03_常用API;

/*
1.概述:
    java.lang.Math: 含执行基本数字运算的方法的工具类。
    Math类构造方法被私有修饰，不能创建对象。
    构造方法被私有修饰，不能创建对象，通过类名调用内部静态内容即可。
2.常用方法:
    public static int abs(int a)                   获取参数a的绝对值
    public static double ceil(double a)            向上取整
    public static double floor(double a)           向下取整
    public static double pow(double a, double b)   获取a的b次幂
    public static long round(double a)             四舍五入取整
    public static int max(int a, int b)            返回两个 int 值中较大的一个
    public static int min(int a, int b)            返回两个 int 值中较小的一个
*/
public class Test_05Math {
    public static void main(String[] args) {
        int a = Math.abs(-5);
        System.out.println(a);
    }
}
