package com.itheima02_Set;

public class StudentToHashSet {
    String name;
    int age;


    public StudentToHashSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToHashSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
