package com.itheima03_Map;

public class StudentToHashMap {
    String name;
    int age;


    public StudentToHashMap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentToHashMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
