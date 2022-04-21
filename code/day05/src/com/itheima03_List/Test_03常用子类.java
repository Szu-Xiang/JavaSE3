package com.itheima03_List;

import java.util.LinkedList;

/*
java.util.ArrayList 数组存储结构集合； 特点：查询快,增删慢,线程不安全
java.util.LinkedList链表存储结构集合； 特点：查询慢,增删快,线程不安全
LinkedList实现原理:双向链表
LinkedList集合特有方法(了解)
            public void addFirst(E e):将指定元素插入此列表的开头
            public void addLast(E e):将指定元素添加到此列表的结尾
            public E getFirst():返回此列表的第一个元素
            public E getLast():返回此列表的最后一个元素
            public E removeFirst():移除并返回此列表的第一个元素
            public E removeLast():移除并返回此列表的最后一个元素
            public E pop():从此列表所表示的堆栈处弹出一个元素
            public void push(E e):将元素推入此列表所表示的堆栈

需求:演示LinkedList类常用方法
 */
public class Test_03常用子类 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("c");
        list.add("b");

        list.addFirst("d");
        System.out.println(list);

        System.out.println(list.removeFirst());
        System.out.println(list);

        list.pop();
        System.out.println(list);

        list.push("f");
        System.out.println(list);
    }
}
