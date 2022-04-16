package com.itheima03_Map;

/*
1.概述
	TreeMap集合是Map接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
	TreeMap集合存储的对象作为键列,必须拥有排序规则(比较器)，否则会报出异常。
2.特点
	元素无索引,元素存取无序,元素不可重复(唯一)
3.使用方式
	自然排序:描述事物的类实现 java.lang.Comparable接口，重写compareTo方法，使用TreeMap无参构造创建集合对象
	比较器排序：创建重写compare方法的Comparator接口实现类对象，作为参数传入TreeMap的构造方法。

需求:将包含姓名和年龄的学生对象作为键, 家庭住址作为值，存储到 TreeMap集合中

 */
public class Test_06TreeMap键列存储自定义类型 {
    public static void main(String[] args) {

    }
}
