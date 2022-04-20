package com.itheima05_自定义类型应用.p01作为参数和返回值类型;

/*
需求:定义如下类，演示引用类型作为方法的参数和返回值类型
    人类
        属性：姓名
    在测试类实现以下功能
        展示人，获取名为张三的人
 */
public class Test {
    public static void main(String[] args) {

        Human h = getHuman();// Human h = new Person();
        showHuman(h);
    }

    public static void showHuman(Human h) {

        System.out.println(h.name);
    }

    public static Human getHuman() {
        Person p = new Person();
        p.name = "张三";
        return p;
    }
}
