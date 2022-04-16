package com.itheima02_接口.p01接口入门;

/*
接口概述
    1.介绍
    	接口是java的一种引用类型，是方法的集合。封装了各种方法。
    2.接口的成员
    	只能定义常量，抽象方法（JDK 7及以前），默认方法(JDK 8)和静态方法（JDK 8）。
    3.接口的编译
    	用 `interface` 关键字定义。
    	会被编译成.class文件，没有构造方法，不能创建对象，
    	其中的非静态方法，可以被实现(重写方法)，类似于继承，这里称为实现，最终通过其实现类创建对象
接口的定义
    1.定义格式
	    public interface 接口名称 {
        		// 静态常量
        		// 抽象方法
        		// 默认方法
        		// 静态方法
	    }
    2.定义规则
    	静态常量格式:public static final 数据类型 变量名 = 值;    		//public static final可以省略
    	抽象方法格式：public abstract 返回值 方法名(参数列表);		//abstract 可以省略，供实现类重写
    	默认方法格式：public default 返回值 方法名(参数列表) { //执行语句  }	//default 不可省略，供实现类调用或者实现类重写
    	静态方法格式：public  static 返回值 方法名(参数列表) { //执行语句  }	//static 不可省略
类与接口的单实现
    1.接口的实现
        类与接口的关系为实现关系，即类实现接口，该类可以称为接口的实现类。
        实现的动作类似继承，只是关键字不同，实现使用 implements关键字。
        实现情况分类：非抽象类实现接口、抽象类实现接口。
    2.接口的实现格式:[ ]表示可选操作
        public [abstract] public  class 类名 implements 接口名 {// 重写接口中抽象方法【必须】}
    3.接口中成员的使用特点
        静态常量  	通过所在接口名调用(推荐)或实现类直接访问。
        抽象方法	实现类为非抽象类必须重写，为抽象类，则可以不实现
        默认方法	实现类可以直接继承，可以重写，通过实现类的对象来调用。
        静态方法	只能通过所在接口名调用






 */
public class Test {
    public static void main(String[] args) {
        //1.接口中只能定义静态常量
        System.out.println(MyInter.NUM);//说明num被static修饰
        //MyInter.num = 999;//说明被final修饰



        //访问规则：
        //1. 接口中的静态常量，可以通过接口名或实现类调用
        MyInterImpl mii = new MyInterImpl();
        System.out.println(MyInter.NUM);

        mii.abstractMethod();

        mii.defaultMethod2();
        mii.defaultMethod();

        //接口中的静态方法，只能通过接口名去调用
        MyInter.staticMethod();

    }
}
