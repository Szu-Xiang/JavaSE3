package com.itheima03_抽象类.p04模板设计模式;

/*
1.抽象类的意义:抽象类存在的意义是为了被子类继承，否则抽象类将毫无意义
2.模板思想:
    抽象类体现的是模板思想，模板是通用的东西。
    抽象类中可以是具体的实现,也可以有抽象方法。
    模板中不能决定的行为定义成抽象方法，让需要使用模板的类（子类）负责重写抽象方法实现。


需求:按照下述要求，使用代码实现
    新司机:开门,点火,双手紧握方向盘,刹车,熄火
    老司机:开门,点火,右手握方向盘左手抽烟,刹车,熄火
分析:
    新老司机都能开车，需要再父类中定义开车功能
    新老司机开车的姿势不同，开车姿势需要定义成抽象方法，由子类重写定义。

 */
public class Test {
    public static void main(String[] args) {
        newDriver nd = new newDriver();
        oldDriver od = new oldDriver();

        System.out.println("以下为新司机：");
        nd.drive();
        System.out.println();
        System.out.println("以下为老司机：");
        od.drive();
    }
}
