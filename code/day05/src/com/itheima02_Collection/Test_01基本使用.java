package com.itheima02_Collection;

/*
集合概述
    1.什么是集合
    	是java中提供的一种容器，可以用来存储多个引用数据类型的数据。
    2.集合的分类
    	单列集合：Collection
    	双列集合: Map
    3.集合与数组的区别
    	长度:数组长度固定；集合长度可变
    	存储类型:数组存基本类型+引用类型；集合存引用类型
    	存储内容:数组明确指定存储内容；集合默认存储Object(不指定泛型)
    	开发中使用数组和集合，都建议明确一种存储类型。

单列集合概述
    1.什么是Collection合
    	java.util.Collection：单列集合类的根接口，用于存储一系列符合某种规则的元素，以单个对象作为存储元素
    2.Collection集合体系 见《Collection集合体系图.jpg》
    	java.util.List:有序单列集合接口
    		|------java.util.ArrayList 	数组结构，查询快,增删慢,线程不安全
    		|------java.util.LinkedList    	链表结构，查询慢,增删快,线程不安全
    		|------java.util.Vector    	数组结构，查询较快,增删慢,线程安全
    	java.util.Set : 无序单列集合接口
    		|------java.util.HashSet	哈希结构，不可排序
    			|------java.util.LinkedHashSet	链表+哈希表结构，有序
    			|------java.util.TreeSet	二叉树结构，可排序

特点
	List:元素有索引，元素有序(先进先出)、元素可重复
	Set:元素无索引，元素无序、元素不可重复

基本使用:
    1.构造方法
    	由于Collection是一个接口，不能创建对象，需要使用其子类ArrayList等类型来创建对象。
    2.添加数据
    	public boolean add(E e)：  把给定的对象添加到当前集合中。
        public boolean add(E e)：  把给定的对象添加到当前集合中
        public boolean remove(E e): 把给定的对象在当前集合中删除
        public boolean contains(Object obj): 判断当前集合是否包含给定的对象
        public boolean isEmpty(): 判断当前集合是否为空
        public int size(): 返回集合中元素的个数
        public Object[] toArray(): 把集合中的元素，存储到数组中
        public void clear():清空集合中所有的元素
需求:通过ArrayList类演示单列集合常用功能
 */
public class Test_01基本使用 {
    public static void main(String[] args) {

    }
}
