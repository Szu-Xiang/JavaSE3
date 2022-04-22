package com.itheima02_Set;

import java.util.LinkedHashSet;

/*
1.概述
	java.util.LinkedHashSet 是HashSet的一个子类，底层采用链表+哈希表，见《哈希表2》
	LinkedHashSet类在保留HashSet元素唯一的基础上，增加了有序性。
2.特点：元素无索引,元素存取有序,元素不可重复(唯一)

 */
public class Test_03_LinkedHashSet存储自定义类型 {
    public static void main(String[] args) {
        //创建集合
        LinkedHashSet<StudentToHashSet> lhs = new LinkedHashSet<>();

        //创建对象
        StudentToHashSet s1 = new StudentToHashSet("张三", 18);
        StudentToHashSet s2 = new StudentToHashSet("李四", 29);
        StudentToHashSet s3 = new StudentToHashSet("李四", 23);
        StudentToHashSet s4 = new StudentToHashSet("李四", 23);

        //添加对象
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);

        for (StudentToHashSet lh : lhs) {
            //输出是有序的
            System.out.println(lh);
        }

    }
}
