package com.itheima01_static.p01基本应用;

/*
static概述
    1.static是静态修饰符，表示静态的意思,可以修饰类中成员(成员方法、成员变量、代码块等)。
    2.编码流程:编写--编译--运行(加载--执行)
    3.static修饰的内容是与对象无关的，即与对象无关的，即可以不通过对象操作。
可以不通过对象操作。

修饰成员位置的变量:
    1.介绍：static修饰成员变量，称为类变量或静态变量，被该类的对象所共享，可以被任意对象(或直接通过类名)修改。
    2.定义格式：修饰符 static 数据类型 变量名；
    3.使用格式：类名.类变量名；

修饰成员位置的方法:
    1.介绍：static修饰方法，称为类方法或静态方法。类方法可以且建议直接使用类名调用。
    2.定义格式：
            修饰符 static 返回值类型 方法名 (参数列表){
        	    // 执行语句
            }
    3.使用格式：类名.静态方法名(参数)；
    4.注意事项:
    	静态方法可以直接访问类变量和静态方法。
    	静态方法不能直接访问普通成员变量或成员方法。
    	成员方法可以直接访问静态变量或静态方法。
    	静态方法中，不能使用this关键字。
修饰代码块
    1.介绍：
	    static修饰代码块，称为静态代码块。
	    位于成员位置，随着类的加载而执行(无需调用)。优先于main和构造方法。
    2.定义格式：
        static {}
 */
public class Test {
    //静态代码块随着字节码加载执行
    //代码执行前，先加载字节码文件，所以下列代码块先执行
    static{
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {

        System.out.println("静态main方法");

        //1. static 修饰的成员位置的变量
        StaticDemo sd1 = new StaticDemo();
        sd1.num = 100;
        //推荐用类名调用静态变量
        StaticDemo.staticNum = 99999;

        StaticDemo sd2 = new StaticDemo();
        sd2.num = 1000;

        //System.out.println(StaticDemo.staticNum);

        //通过 类名. 直接调用
        //StaticDemo.staticMethod();

        staticShow();
        //访问非静态方法，需要new一个对象，通过对象进行调用
        Test t = new Test();
        Test t2 = new Test();
        t.show();

    }

    //注意事项点演示
    int num = 10;
    static int staticNum = 999;

    public static void staticMethod(){}
    public void method(){}

    public static void staticShow() {
        System.out.println(staticNum + ", ");
        //静态方法不能直接访问普通成员变量或方法，因为不需要对象，而
        //普通成员或方法需要先new一个对象出来。
    }

    public void show() {
        //普通成员方法可以直接访问静态方法
        staticShow();
    }


}

