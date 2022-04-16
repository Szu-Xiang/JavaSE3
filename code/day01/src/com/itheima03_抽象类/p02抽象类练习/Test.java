package com.itheima03_抽象类.p02抽象类练习;

import com.itheima02_Extends.p07继承的特点.C;

/*
思路
    1.根据向上抽取原则，定义抽象类
    2.根据子类实现各不相同的原则，将父类中的work方法定义成抽象方法，父类定义成抽象类。
    3.定义子类继承父类，并重写抽象方法。
    4.使用子类。


示例：根据抽象类的理解，定义如下类
    管理者(Manager)
        属性:id，姓名，工资
        行为:工作
    厨师(Cook)
        属性:id，姓名，工资
        行为:工作

 */
public class Test {
    public static void main(String[] args) {
        Cook c = new Cook("C0001","zhangsan",12000);
        Manager m = new Manager("M0001", "lisi", 15000);



        c.show();
        c.work();

        m.show();
        m.work();

    }
}
