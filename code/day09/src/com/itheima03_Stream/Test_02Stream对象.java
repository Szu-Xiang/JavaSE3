package com.itheima03_Stream;

import java.util.*;
import java.util.stream.Stream;

/*
1.集合获取Stream流
    java.util.Collection接口中加入了default Stream<E>  stream()方法用来获取流，即所有单列集合均可获取流。
    java.util.Map接口未提供获取流的方法，需分别根据其键和值的集合后，再获取流对象。
2.数组获取Stream流
    数组对象没有方法，所以Stream接口中提供了静态方法static<T> Stream<T> of(T t)方法获取数组对应的流。
需求:分别获取Collection、Map及数组的Stream流对象

*/
public class Test_02Stream对象 {
    public static void main(String[] args) {
        //获取单列集合的Stream对象
        Collection<Integer> c = new ArrayList<>();
        Stream<Integer> stream = c.stream();

        //双列集合的Stream对象
        Map<Integer, Integer> map = new HashMap<>();
        //获取键列的流对象
        Set<Integer> set = map.keySet();
        Stream<Integer> stream1 = set.stream();
        //获取值列的流对象
        Collection<Integer> c2 = map.values();
        Stream<Integer> stream2 = c2.stream();

        //获取数组的流对象
        int[] arr = {1,2,3};
        //of(T t)
        Stream<int[]> stream3 = Stream.of(arr);

        //of(T ..values)
        Stream<Integer> stream4 = Stream.of(1, 2, 3);
    }
}
