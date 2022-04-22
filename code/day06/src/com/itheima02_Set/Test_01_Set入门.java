package com.itheima02_Set;

import java.util.HashSet;
import java.util.Set;

/*
1.概述
	java.util.Set接口继承自Collection接口，是单列集合的一个重要分支。
	实现了Set接口的对象称为Set集合。
	Set集合无索引，只能是用增强for和迭代器遍历
2.特点
	元素无索引,元素存取无序,元素不可重复(唯一)
3.常见子类
	java.util.HashSet：哈希表结构集合
	java.util.LinkedHashSet：链表结构集合
	java.util.TreeSet：树结构集合。

需求:在测试类中演示Set的基本使用

 */
public class Test_01_Set入门 {
    public static void main(String[] args) {
        //创建集合
        HashSet<String> set = new HashSet<>();

        //添加数据，会自动排序
        set.add("d");
        set.add("c");
        set.add("b");
        set.add("a");

        System.out.println(set);
    }
}
