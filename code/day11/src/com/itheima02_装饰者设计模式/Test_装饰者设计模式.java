package com.itheima02_装饰者设计模式;

import com.itheima02_装饰者设计模式.LiuDeHua;
import com.itheima02_装饰者设计模式.LiuDeHuaWrapper;

/*
概述
    1.介绍
    	装饰模式指的是在不改变原类, 不使用继承的基础上，动态地扩展一个对象的功能。
    2.设计原则
    	装饰类和被装饰类必须实现相同的接口
    	在装饰类中必须传入被装饰类的引用
    	在装饰类中对需要扩展的方法进行扩展
    	在装饰类中定义的方法名，与被装饰需被扩展的方法同名
演示
    1.需求:
    	a.编写一个Star接口, 提供sing 和 dance抽象方法
    	b.编写一个LiuDeHua类,实现Star接口,重写抽象方法
    	c.在不修改LiuDeHua类的原则上，利用装饰者模式对LiuDeHua类的sing方法进行扩展。
    2.分析
    	①编写一个LiuDeHuaWarpper类, 实现Star接口,重写抽象方法
    	②提供LiuDeHuaWarpper类的有参构造, 传入LiuDeHua类对象
    	③在LiuDeHuaWarpper类中对需要增强的sing方法进行增强
    	④在LiuDeHuaWarpper类中对不需要增强的方法调用LiuDeHua类中的同名方法
 */
 public  class Test_装饰者设计模式 {
    public static void main(String[] args) {
        LiuDeHua ldh = new LiuDeHua();
        LiuDeHuaWrapper ldhw = new LiuDeHuaWrapper(ldh);

        ldhw.sing();
        ldhw.dance();

    }
}
