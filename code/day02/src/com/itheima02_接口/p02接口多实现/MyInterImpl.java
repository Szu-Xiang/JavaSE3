package com.itheima02_接口.p02接口多实现;

public class MyInterImpl implements MyInter1, MyInterB{

    //多个父接口中相同的抽象方法，必须重写1次
    public void abstractMethod() {

        System.out.println("实现类重写了2个接口的抽象方法");
    }

    //多个父接口中相同的默认方法，实现类必须重写1次。省略default
    public void defaultMethod() {

        System.out.println("实现类重写了2个接口中的默认方法");
    }
}
