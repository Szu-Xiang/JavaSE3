package com.itheima02_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
1.概述
	java.util.Iterator    Collection集合元素的通用获取方式接口。
2.获取迭代器对象
	public Iterator<E> iterator(): 获取集合对应迭代器，遍历集合中的元素。
	设计思想:提供统一获取迭代器的方式，由子类实现该方法，获取属于自己的迭代器(类似抓娃娃机)。
3.迭代器常用方法
	public E next():返回迭代的下一个元素
	public boolean hasNext():如果仍有元素可以迭代，则返回 true。
4.常见异常
    java.util.NoSuchElementException	没有元素异常
    ConcurrentModificationException		并发修改异常
5.实现原理:见《迭代器原理图》
    通过hashNext方法判断是否有下一个元素。
    通过next方法获取下一个元素，并将指针挪动到下一位。

需求:通过ArrayList类演示迭代器的使用
 */
public class Test_02迭代器遍历 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        //添加数据
        c.add("刘备");
        c.add("关羽");
        c.add("张飞");

        //获取迭代器对象
        Iterator<String> it = c.iterator();

        //迭代数据
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        //通过迭代器对象判断是否还有元素
        while(it.hasNext()) {

            //c.add("曹操");//并发修改异常
            String s = it.next();//获取前，先去比较迭代器记录的元素个数和集合实际元素个数是否相同
            System.out.println(s);

        }

    }
}
