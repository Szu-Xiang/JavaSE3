package com.itheima03_Stream;

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

    }
}
