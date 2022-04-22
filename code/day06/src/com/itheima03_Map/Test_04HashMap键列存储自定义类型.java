package com.itheima03_Map;

import java.util.HashMap;
import java.util.Set;

/*
1.概述
	java.util.HashMap是Map接口的一个实现类,存储数据采用的哈希表结构(数组+链表+红黑树)。
	键值对的存储由键列决定。如果自定义类的对象作为键，要确保键值对唯一,需重写hashCode和equals方法,原理同HashSet。
2.特点
	元素无索引,元素存取无序,元素的键不可重复

需求:将包含姓名和年龄的学生对象作为键, 家庭住址作为值，存储到Hashmap集合中。

 */
public class Test_04HashMap键列存储自定义类型 {
    public static void main(String[] args) {

        //创建集合
        HashMap<StudentToHashMap, String> hm = new HashMap<>();

        StudentToHashMap s1 = new StudentToHashMap("张三", 18);
        StudentToHashMap s2 = new StudentToHashMap("李四", 18);
        StudentToHashMap s3 = new StudentToHashMap("王武", 18);
        StudentToHashMap s4 = new StudentToHashMap("赵六", 18);


        hm.put(s1,"北京");
        hm.put(s2,"上海");
        hm.put(s3,"广州");
        hm.put(s4,"深圳");

        Set<StudentToHashMap> keys = hm.keySet();
        for (StudentToHashMap key : keys) {
            String value = hm.get(key);

            System.out.println(key + " " + value);
        }
    }
}
