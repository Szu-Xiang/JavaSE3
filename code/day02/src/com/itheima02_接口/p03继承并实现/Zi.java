package com.itheima02_接口.p03继承并实现;

public class Zi extends Fu implements MyInter {

    //重写父类与接口中相同的抽象方法
    public void abstractMethod() {
        System.out.println("子类重写了抽象方法");
    }

    //父类的成员方法与接口的默认方法同名，优先使用父类，所以无需重写。



}
