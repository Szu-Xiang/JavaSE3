package com.itheima03_List;

import java.util.ArrayList;
import java.util.List;

/*
1.什么是List
	java.util.List接口继承自Collection接口，是单列集合的一个重要分支，实现了List接口的类称为List集合。
2.List的特点
	它是一个元素存取有序的集合
	它是一个带有索引的集合，通过索引就可以精确的操作集合中的元素
    元素可以重复

需求:通过ArrayList类演示特点

 */
public class Test_01概述 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
