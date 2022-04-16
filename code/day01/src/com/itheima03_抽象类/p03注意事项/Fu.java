package com.itheima03_抽象类.p03注意事项;

public abstract class Fu {
    public Fu() {
        System.out.println("父类无参构造");
    }

    public void method() {
        System.out.println("父类的method方法");
    }

    public abstract void abstractMethod();

}
