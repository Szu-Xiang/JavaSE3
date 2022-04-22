package com.itheima03_Map;

import com.itheima02_Set.StudentToTreeSet2;

public class StudentToTreeMap2 implements Comparable<StudentToTreeMap2> {
    String name;
    int age;

    public StudentToTreeMap2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToTreeMap2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentToTreeMap2 o) {
        return 0;
    }
}
