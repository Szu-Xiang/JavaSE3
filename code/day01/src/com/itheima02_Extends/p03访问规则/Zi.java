package com.itheima02_Extends.p03访问规则;

public class Zi extends Fu {
    //父类的构造方法不能继承给子类
    public void ziMethod() {
        System.out.println("子类中的fumethod方法");
    }

    public void method() {
        System.out.println("子类method");
    }

    //重写方法， 权限要大于等于父类中该方法的权限，public > private;
    @Override //方法重写的注释，必须写
    public void show() {
        System.out.println("woshinidi");
    }

}
