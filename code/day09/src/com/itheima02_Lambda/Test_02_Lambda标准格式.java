package com.itheima02_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
1.前提
	必须具有接口，且要求接口中有且仅有一个抽象方法。
	有且仅有一个抽象方法的接口，称为函数式接口
	@FunctionalInterface注解:检查一个接口是否是函数式接口
2.格式
	(参数类型 参数名)->{代码语句}
 		()内的语法与传统方法参数列表一致：无参数则留空，多个参数则用逗号分隔。
 		->是新引入的语法格式，代表指向动作。
 		{}内的语法与传统方法体要求基本一致。

需求:通过Lambda的标准格式完成Collections中的自定义排序功能。
*/
public class Test_02_Lambda标准格式 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(20);
        Collections.sort(list, Comparator.comparingInt((Integer i) -> i));

        System.out.println(list);

    }
}
