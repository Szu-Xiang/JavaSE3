package com.itheima02_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
1.概述
	增强for循环(foreach循环)，是JDK1.5以后出来的一个高级for循环，专门用来遍历数组和Collection集合。
	基于Iterator迭代器实现，因此，使用增强for遍历过程中，不能对集合中的元素进行增删操作，否则抛出并发修改异常。
2.格式
	for(元素的数据类型  变量 : Collection集合or数组){
  		//写操作代码
	}

需求:通过ArrayList集合演示增强for循环

 */
public class Test_03增强for遍历 {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");

        Iterator<String> it = c.iterator();

        for(String s : c) {

            System.out.println(s);
        }

    }
}
