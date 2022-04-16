package com.itheima02_Set;

/*
1.概概述
	TreeSet集合是Set接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
	TreeSet集合存储的对象必须拥有排序规则(比较器)，否则会报出异常。
2.特点：元素无索引,元素存取无序,元素不可重复(唯一)
3.使用方式
	自然排序:描述事物的类实现 java.lang.Comparable接口，重写compareTo(Object o)方法，使用TreeSet无参构造创建集合对象
	    this表示后添加的元素
	比较器排序：创建重写compare(E e1,E e2)方法的Comparator接口实现类对象，作为参数传入TreeSet的构造方法。
	    e1表示后添加的元素
 */

public class Test_04_TreeSet存储自定义类型 {
    public static void main(String[] args) {

    }
}
