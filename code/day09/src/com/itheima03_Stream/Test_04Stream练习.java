package com.itheima03_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
1.需求:
	定义两个ArrayList集合，存储两组姓名，根据如下要求，刷选最终数据。
	    第一组:"宋远桥","苏星河","老子","庄子","孙子","洪七公"
	    第二组:"古力娜扎","张无忌","张三丰","赵丽颖","张二狗","张天爱","张三"
	1.1第一个队伍只要名字为3个字的成员姓名；1.2第一个队伍筛选之后只要前2个人；
	2.1第二个队伍只要姓张的成员姓名；2.2第二个队伍筛选之后不要前2个人；
	3. 将两个队伍合并为一个队伍；
	4.根据姓名创建Person对象并存储到集合；
	5.打印整个队伍的Person对象信息。
2.分析:
	使用Stream流的形式，代码书写更佳简洁。
	小作业:使用非Stream的形式完成。

*/
public class Test_04Stream练习 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        Stream<String> s11 = one.stream();

        Stream<String> s12 = s11.filter((String s) -> {
            return s.length() == 3;
        });

        //筛选前两个
        Stream<String> s13 = s12.limit(2);

        Stream<String> s21 = two.stream();
        Stream<String> s22 = s21.filter((String s) -> {
            return s.startsWith("张");
        });

        //不要前两个
        Stream<String> s23 = s22.skip(2);

        Stream<String> allNames = Stream.concat(s13, s23);

        //根据姓名创建Person对象并存储到集合；
        Stream<Person> personStream = allNames.map((String s) -> {
            return new Person(s);
        });

        personStream.forEach((Person p) -> {
            System.out.println(p);
        });

        //链式编程
        //Stream.concat();
    }
}

