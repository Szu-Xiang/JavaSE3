package com.itheima02_Lambda;

/*
1.省略要求
	小括号内参数的类型可以省略；
	如果小括号内有且仅有一个参数，则小括号和参数类型可以一起省略；
	大括号内有且仅有一个语句，则可以同时省略(一对大括号+语句后的分号+return)；
需求:自定义函数式接口，作为方法的参数，通过Lambda的省略格式调用该方法。
*/

public class Test_03_Lambda省略格式 {
    public static void main(String[] args) {

    }

    public static void show1(int a, int b, MyInter m) {
        m.run(a, b);
    }

    public static void show2(int a, MyInter2 m) {
        m.run(a);
    }

    public static void show3(int a, MyInter3 m) {
        m.run(a);
    }

    public static void show4(int a, MyInter4 m) {
        m.run(a);
    }
}

@FunctionalInterface
interface MyInter {
    void run(int a, int b);
}

@FunctionalInterface
interface MyInter2 {
    void run(int a);
}

@FunctionalInterface
interface MyInter3 {
    void run(int a);
}

@FunctionalInterface
interface MyInter4 {
    int run(int a);
}

