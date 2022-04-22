package com.itheima03_Map;

public class StudentToTreeMap1 implements  Comparable<StudentToTreeMap1>{
    String name;
    int age;

    public StudentToTreeMap1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToTreeMap1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentToTreeMap1 s) {

        //姓名升序
        int num = this.name.compareTo(s.name);
        //姓名相同，则年龄降序
        num = num == 0?s.age - this.age:num;

        return num;
    }
}
