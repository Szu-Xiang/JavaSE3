package com.itheima03_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
1.概述
	JDK8中为了支持Lambda，制作了一些应用,Stream就是一个典型的应用。
	java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。
	Stream流：是一个接口，功能类似于迭代器，但更强大，可以对数据进行过滤、筛选、汇总等操作。
2.思想
    Stream流，类似于车间的流水线，每次操作流，都可以将结果发送给下一个操作。
    Stream流基于一定的函数模型思想设计，目的是为了拥有更好的性能和便利性。
    Stream流包含了过滤、映射、跳过、计数等模型，调用指定方法，会使流模型转为另一个流模型。
    Stream中将操作模型分为了延迟性与终结性两种，以便更好的执行流策略。
3.Stream特点
    Stream流是一次性的,不能重复使用，当执行流的某个方法，这个流将将失效，并将结果存储到新流中。
    Stream流不会存储数据
    Stream流不会修改数据源
    Stream流搭建的函数模型，只有终结方法存在,前面的延迟性方法才会执行。

需求:使用集合与Stream流中的方法完成下列需求:
    定义一个集合，存储若干姓名("张三","李四","王五","赵六","孙七","周八","张三丰")，将List集合中姓张的的元素过滤到一个新的集合中
    然后将过滤出来的姓张的元素中过滤出长度为3的元素,存储到一个新的集合中

*/
public class Test_01Stream入门 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周润发");
        list.add("周星驰");
        list.add("成龙");
        list.add("谢霆锋");
        list.add("古天乐");
        list.add("吴京");
        list.add("梅西");

        //过滤到一个集合中
        List<String> listOne = new ArrayList<>();
        for (String name : list) {
            if(name.length() == 3) {
                listOne.add(name);
            }
        }

//        Stream<String> s1 = list.stream();
//        Stream<String> s2 = s1.filter((String s) -> {
//            return s.length() == 3;
//        });
//        Stream<String> s3 = s2.limit(3);
//
//        s3.forEach((String s) -> {
//            System.out.println(s);
//        });

        list.stream().filter(s -> s.length() == 3).limit(3).forEach(s -> System.out.println(s));

    }
}
