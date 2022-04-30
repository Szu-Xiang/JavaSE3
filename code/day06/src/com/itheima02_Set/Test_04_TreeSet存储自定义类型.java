package com.itheima02_Set;

/*
1.概概述
	TreeSet集合是Set接口的一个实现类，底层依赖于TreeMap,是一种基于红黑树的实现
	TreeSet集合存储的对象必须拥有排序规则(比较器)，否则会报出异常。
2.特点：元素无索引,元素存取无序,元素不可重复(唯一)
3.使用方式
	自然排序:描述事物的类实现 java.lang.Comparable接口，重写compareTo(Object o)方法，使用TreeSet无参构造创建集合对象
	    this表示后添加的元素
	比较器排序：创建重写compare(E e1,E e2)方法的Comparator接口实现类对象，作为参数传入TreeSet的构造方法。
	    e1表示后添加的元素
 */

import java.util.Comparator;
import java.util.TreeSet;

public class Test_04_TreeSet存储自定义类型 {
    public static void main(String[] args)   {
        //自然排序实现
        method1();

        //比较器排序
        Comparator c = new Comparator<StudentToTreeSet2>() {
            @Override
            public int compare(StudentToTreeSet2 s1, StudentToTreeSet2 s2) {
                //s1表示的是后面的数据，s2表示的是前面的数据
                //姓名升序
                int num = s1.name.compareTo(s2.name);
                //姓名相同，则年龄降序
                num = num == 0?s2.age - s1.age:num;
                return num;
            }
        };

        //创建学生对象
        TreeSet<StudentToTreeSet2> ts = new TreeSet<>(c);
        StudentToTreeSet2 s1 = new StudentToTreeSet2("Zhangsan", 18);
        StudentToTreeSet2 s2 = new StudentToTreeSet2("Lisi", 20);
        StudentToTreeSet2 s3 = new StudentToTreeSet2("Lisi", 24);
        StudentToTreeSet2 s4 = new StudentToTreeSet2("Lisi", 23);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (StudentToTreeSet2 t : ts) {
            System.out.println(t);
        }

    }

    public static void method1() {
        //自然排序实现
        //创建集合
        TreeSet<StudentToTreeSet1> ts = new TreeSet<>();
        //创建学生对象
        StudentToTreeSet1 s1 = new StudentToTreeSet1("Zhangsan", 18);
        StudentToTreeSet1 s2 = new StudentToTreeSet1("Lisi", 20);
        StudentToTreeSet1 s3 = new StudentToTreeSet1("Lisi", 24);
        StudentToTreeSet1 s4 = new StudentToTreeSet1("Lisi", 23);

        //添加对象
        //StudentToTreeSet1 cannot be cast to java.lang.Comparable
        //需要重写compareTo方法，升序this放前面，降序this放后面
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (StudentToTreeSet1 t : ts) {
            System.out.println(t);
        }

        System.out.println();

    }
}
