package com.itheima03_Stream;

public class Person {
    private String name;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{name = " + name + "}";
    }
}
