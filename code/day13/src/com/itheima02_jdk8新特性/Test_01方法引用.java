package com.itheima02_jdk8新特性;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
1.新特性概述
    在JDK8中更新了很多新特性，较为常见的有意向以下内容。
    Lambda表达式【已学习过】、默认方法【已学习过】、Stream【已学习过】、方法引用、Base64。
2.方法引用概述
    方法引用：一种用方法替代Lambda的方式，需要和Lambda表达式配合使用。
    要做的事情(方法逻辑、构造方法、实例化对象)已有方法完成，就可以直接引用已有方法，不用再写Lambda表达式。
​	方法引用使得java类的代码看起来紧凑而简洁，避免出现过多复杂的重复代码。
3.方法引用应用语法
     ①构造器引用：语法是Class::new或Class<T>::new。
     ②静态方法引用：语法是Class::static_method。
     ③特定类的任意对象的方法引用：语法是Class::method
     ④特定对象的方法引用：语法是instance::method

需求:演示方法引用。
 */

public class Test_01方法引用 {
    public static void main(String[] args) {

    }
}



