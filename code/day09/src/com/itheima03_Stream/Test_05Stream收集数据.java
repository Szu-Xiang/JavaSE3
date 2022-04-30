package com.itheima03_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1.概述：
    对流操作完成之后，如果需要将其结果进行收集,可以根据需要收集到集合和数组中。
2.方法介绍
    方法名	作用	            分类	    链式	    详解
    collect	收集结果到集合中	终结	    否	    "Rcollect(Collector<T,A,R>coll)：转换为指定的集合，R代表最终转为的集合的具体类型
                                            java.util.stream.Collectors类提供一些方法，可以作为Collector接口的实例。
                                                public static <T> Collector<T, ?, List<T>> toList()：转换为List集合。
                                                public static <T> Collector<T, ?, Set<T>> toSet()：转换为Set集合。"
    toArray	收集结果到数组中	终结	    否	    Object[]toArray()：转换为Object数组
需求:演示将流中的数据转换到集合与数组中

*/
public class Test_05Stream收集数据 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        //收集到集合中
        Object[] arr = stream.toArray();
        System.out.println(Arrays.toString(arr));

        Stream<String> stream2 = Stream.of("a", "b", "c");
        //收集到list集合
        List<String> list = stream2.collect(Collectors.toList());
        System.out.println(list);
        //收集到Set集合
        Set<String> set = stream2.collect(Collectors.toSet());
        System.out.println(set);

    }
}
