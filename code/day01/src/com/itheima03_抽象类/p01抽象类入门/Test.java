package com.itheima03_抽象类.p01抽象类入门;

/*
概述
    1.概念
    	抽象方法:没有方法体的方法
    	抽象类:包含抽象方法的类就是抽象类
    2.意义
    	当一个父类中的方法，子类实现各不相同时，父类中该方法可以定义成抽象方法。
抽象类入门
    1.抽象方法格式：public abstract 返回值类型 方法名(形参);
    2.抽象类格式
    	public abstract   class 类名{
    		//1.成员变量
    		//2.成员方法
    		//3.构造方法
    		//4.抽象方法
    	}
    使用形式:[]表示可写，可不写。
        public [abstract]   class 子类  extends 父类{}
            如果子类是抽象类，可以不重写抽象方法。
            如果子类不是抽象类，必须重写抽象方法。
示例:根据抽象类的理解，定义如下类
    动物类
        行为:eat(未知行为)
    猫类
        行为:eat(吃鱼)
    狗类
        行为:eat(吃骨头)
 */
public class Test {
    public static void main(String[] args) {

    }
}
