package com.itheima04_包装类;

/*
概述:
    Java提供了两个类型系统，基本类型与引用类型，基本类型效率更高。
    为了便于操作，java为在lang包下为基本类型创建了对应的引用类型，称为包装类

包装类分类
    | 类型   | byte | short | int     | long | float | double | char      | boolean |
    | ------| ---- | ----- | ------- | ---- | ----- | ------ | --------- | ------- |
    | 包装类 | Byte | Short | Integer | Long | Float | Double | Character | Boolean |
    由于分类较多，接下来的讲解统一以Integer为例类。

构造方法
    public Integer(int value)  根据 int 值创建 Integer 对象(过时)
    public Integer(String s)  根据 String 值创建 Integer 对象(过时)
常用方法
    public static Integer valueOf(int i)  返回表示指定的 int 值的 Integer   实例
    public static Integer valueOf(String s)  返回保存指定String值的 Integer 对象
    public  int intValue() 返回Integer对象的int形式
装箱与拆箱:
    装箱：从基本类型转换为对应的包装类对象(构造方法/valueOf)。
    拆箱：从包装类对象转换为对应的基本类型(intValue)。
自动装箱与拆箱:
    Java 5开始，装箱、拆箱动作可以自动完成。
    自动装箱：基本类型传递给包装类型
    自动拆箱：包装类型传递给基本类型
 */

public class Test_01基本使用 {
    public static void main(String[] args) {

        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1);

        int i3 = 20;
        Integer ii3 = Integer.valueOf(i3);

        String s4 = "30";
        Integer ii4 = Integer.valueOf(s4);

        System.out.println(ii3);
        System.out.println(ii4);

        //自动装箱
        int i6 = 60;
        Integer ii6 = i6;

        //自动拆箱
        Integer ii7 = new Integer(70);
        int i7 = ii7;

    }

}

