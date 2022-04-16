package com.itheima03_多线程入门;

/*
创建线程的三种方式
    1.创建Thread子类
        定义Thread类的子类，并重写该类的run()方法
        创建Thread子类的实例，即创建了线程对象
        调用线程对象的start()方法来启动该线程
    2.传入Runnable实现类对象
        定义Runnable接口的实现类，并重写该接口的run()方法。
        创建Runnable实现类的实例，作为Thread的构造参数创建Thread对象。
        调用Thread线程对象的start()方法来启动线程
    3.使用Runnable匿名对象类
        使用匿名内部类的方式实现Runnable接口
        重写Runnable接口中的run方法
        将匿名内部类创建的接口对象传入Thread对象
	    调用start方法执行线程
使用Runnable的优势
	Runnable适合多个相同的程序代码的线程去共享同一个资源
	Runnable可以避免java中的单继承的局限性
	Runnable方式增加程序的健壮性，实现解耦操作，代码既可以被多个线程使用又保持了与线程的独立性
	线程池只能放入实现Runable或Callable类线程，不能直接Thread或其子类

需求:演示线程三种常见实现方法。

 */
public class Test_02三种实现方式 {
    public static void main(String[] args) {

    }
}
