package com.itheima02_代码块;

/*
1.构造代码块
	格式:{  //执行语句  }
	执行时机:每次创建对象都会执行构造代码块,优先于构造方法执行
2.静态代码块
	格式:static{  //执行语句  }
	执行时机:随着类的加载而执行且执行一次，优先构造方法和构造代码块的执行

示例：在Person类中定义构造代码块和静态代码块，观察执行效果。
    执行顺序:静态代码块--构造代码块--构造方法


 */
public class Test {

    static {
        System.out.println("Test的静态代码块");
    }

    {
        System.out.println("Test构造代码块");
    }

    public static void main(String[] args) {
        new Person();
        new Test();
    }
}
