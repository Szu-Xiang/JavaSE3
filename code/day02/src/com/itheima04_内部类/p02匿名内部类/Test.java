package com.itheima04_内部类.p02匿名内部类;

/*
1.介绍：内部类的简化写法。它的本质是一个指定父类或接口的(带具体实现)子类或实现类对象。
2.意义:当一个类或接口中的方法，在重写后，只需要使用1次的时候，可以使用匿名内部类简化书写。
3.格式:
    new 父类名或者接口名(){  // 方法重写 };
    表示创建了new后面指定类型的子类或实现类对象，而不需要体现这个子类或实现类的名字(匿名)
4.使用场景
    通过多态的形式指向父类引用
    直接调用方法
    作为方法参数传递

需求:
 */
public class Test {
    public static void main(String[] args) {
        //匿名内部类简化
        showFly(new Flyable() {
            @Override
            public void fly() {
                System.out.println("luoxuanqifei");
            }
        });

    }

    public static void showFly(Flyable f) {
        System.out.println("准备就绪");
        f.fly();
        System.out.println("平稳落地");
    }
}
