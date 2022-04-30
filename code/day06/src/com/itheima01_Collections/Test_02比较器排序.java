package com.itheima01_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);

        //获取一个Comparator实现类对象：匿名内部类
        new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                //o1表示后面的数，o2是前面的数
                System.out.println("o1" + o1 + ", o2" + o2);
                return 0;
            }
        };

        //调用含有比较器的排序功能
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            //o1:后面的数字
            //o2:前面的数字
            public int compare(Integer o1, Integer o2) {
                //若想实现降序、升序排列，则需要重写return
                //升序
                //return o1 - o2;
                //降序
                return o2 - o1;
            }
        };

        list.sort(c);
        System.out.println(list);
    }
}
