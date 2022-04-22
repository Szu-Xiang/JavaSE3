package com.itheima03_Map;

import com.itheima02_Set.StudentToTreeSet2;

import java.util.*;

/*
1.概述
	TreeMap集合是Map接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
	TreeMap集合存储的对象作为键列,必须拥有排序规则(比较器)，否则会报出异常。
2.特点
	元素无索引,元素存取无序,元素不可重复(唯一)
3.使用方式
	自然排序:描述事物的类实现 java.lang.Comparable接口，重写compareTo方法，使用TreeMap无参构造创建集合对象
	比较器排序：创建重写compare方法的Comparator接口实现类对象，作为参数传入TreeMap的构造方法。

需求:将包含姓名和年龄的学生对象作为键, 家庭住址作为值，存储到 TreeMap集合中

 */
public class Test_06TreeMap键列存储自定义类型 {
    public static void main(String[] args) {

        //新建比较器对象
        Comparator c = new Comparator<StudentToTreeMap2>() {
            @Override
            public int compare(StudentToTreeMap2 s1, StudentToTreeMap2 s2) {
                //姓名升序
                int num = s1.name.compareTo(s2.name);
                //姓名相同则年龄降序
                num = num == 0 ? s2.age - s1.age : num;
                return num;
            }
        };

        //新建集合,并传入比较器对象
        TreeMap<StudentToTreeMap2, String> tm = new TreeMap<>(c);

        //新建学生对象
        StudentToTreeMap2 s1 = new StudentToTreeMap2("zhangsan", 18);
        StudentToTreeMap2 s2 = new StudentToTreeMap2("lisi", 20);
        StudentToTreeMap2 s3 = new StudentToTreeMap2("zhangsan", 20);
        StudentToTreeMap2 s4 = new StudentToTreeMap2("zhangsan", 18);

        //添加数据
        tm.put(s1,"深圳");
        tm.put(s2,"广州");
        tm.put(s3,"上海");
        tm.put(s4,"北京");

        //遍历集合
        Set<StudentToTreeMap2> keys = tm.keySet();
        for (StudentToTreeMap2 key : keys) {
            String value = tm.get(key);
            System.out.println(key + " " + value);
        }


    }

}
