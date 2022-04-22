package com.itheima03_Map;

public class StudentToHashMap {
    String name;
    int age;




    public StudentToHashMap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentToHashMap() {
    }

    @Override
    public String toString() {
        return "StudentToHashMap{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
