package com.itheima01_Collections;

/*
1.概述
	public interface Comparator<T>  定义比较对象规则的接口。
2.常用方法
	Comparator接口中提供了方法，如下
	public int compare(T  o1,T  o2) 比较用来排序的两个参数
	    o1表示后面的元素，o2表示前面的元素
3.应用场景
	用于Collections类的(自定义)排序功能，如下
	<T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

需求:演示Comparator在集合工具类排序功能中的使用

 */
public class Test_02比较器排序 {
    public static void main(String[] args) {

    }
}
