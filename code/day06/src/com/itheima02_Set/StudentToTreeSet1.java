package com.itheima02_Set;

public class StudentToTreeSet1 implements Comparable<StudentToTreeSet1>{
    String name;
    int age;

    public StudentToTreeSet1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToTreeSet1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentToTreeSet1 s) {

        //升序：
        //return this - s;
        //降序
        //return s - this;

        //姓名升序
        //升序this放前面
        int num = this.name.compareTo(s.name);
        //姓名相同，则年龄降序
        //降序this放后面
        num = num == 0?s.age - this.age:num;

        return num;
    }
}
