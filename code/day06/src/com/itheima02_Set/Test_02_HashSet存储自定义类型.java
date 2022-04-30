package com.itheima02_Set;

import java.util.HashSet;

/*
1.概述
	java.util.HashSet是Set接口的一个实现类,底层的实现其实是一个java.util.HashMap支持
	根据对象的哈希值来确定元素在集合中的存储位置，具有良好的存储和查找性能
	JDK1.8之前，哈希表底层采用数组+链表见。JDK1.8开始，哈希表存储采用数组+链表+红黑树,见《哈希表1》。
	jdk8为提高查询效率，当一列数据达到8个且总数据达到64个，则增加数组长度，重新排列数据数据
2.特点：元素无索引,元素存取无序,元素不可重复(唯一)
3.元素唯一原理
	根据hashCode值是否相同决定存储的列(相同则一列)
	根据元equals是否相同判断是否已存在(hashCode不同，元素一定不同，hashCode相同，素有可能不同)
	见《哈希表流程图》。
4.使用方式
	存储对象默认使用继承自Object类中的hashCode方法和equals方法的比较结果实现去重存储(默认根据地址值存储)。
	实际开发中我们一般需要在类中，对这两个方法重写。
 */
public class Test_02_HashSet存储自定义类型 {
    public static void main(String[] args) {

        //hashCode相同，但内容不同
//        System.out.println("Aa".hashCode());
//        System.out.println("BB".hashCode());

        HashSet<StudentToHashSet> hs = new HashSet<>();
        //创建对象
        StudentToHashSet s1 = new StudentToHashSet("张三", 18);
        StudentToHashSet s2 = new StudentToHashSet("李四", 20);
        StudentToHashSet s3 = new StudentToHashSet("李四", 20);
        StudentToHashSet s4 = new StudentToHashSet("李四", 23);

        //添加数据
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历集合，查看数据
        for (StudentToHashSet h : hs) {
            System.out.println(h);
        }


    }
}
