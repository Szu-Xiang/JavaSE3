package com.itheima03_多线程入门;

/*
异常概述
    1.并行与并发
    	并行：两个或多个事件在同一时刻发生(同时执行)，微观上的同时运行，多个CPU设备，执行多个程序，同一时刻可能同时执行多个线程
    	并发：两个或多个事件在同一时段发生(交替执行)，宏观上的同时运行，单个CPU设备，执行多个程序，同一时刻只能执行同时一个线程
    2.进程与线程
    	进程:程序在内存的一次执行过程(创建-运行-消亡)，即程序在系统运行的基本单位。一个程序可以同时运行多个进程。
    	线程:线程是进程的执行单元(一个进程至少有一个线程)，负责当前进程中具体执行，如果有多个线程，称为多线程程序。
    3.进程与线程区别
    	进程：有独立的内存空间，进程中的数据存放空间（堆空间和栈空间）是独立的，至少有一个线程
    	线程：堆空间是共享的，栈空间是独立的，线程消耗的资源比进程小
    4.线程调度
    	CPU以某种顺序执行多个线程，我们把这种情况称之为线程调度
    	随机性:CPU按照一定原则，在某一刻随机分配执行权限给某个线程，开发者无法直接干预。
    	分时调度:由CPU按照均分原则,平均分配执行机会给所有线程。
    	抢占式调度:CPU按照优先原则，分配执行机会给线程，原则上优先级高的抢夺几率变高，优先级相同，按相同概率随机选择
    	Java中采用抢占式调度。
基本使用
    1.Thread概述:
    	java.lang.Thread类代表线程，所有的线程对象都必须是Thread类或其子类的实例
    	线程的作用是完成一定的任务，实际上就是执行一段程序,这段程序需要定义在Thread或其子类的run()方法中。
    2.构造方法
    	public Thread():分配一个新的线程对象
    	public Thread(String name):分配一个指定名字的新的线程对象
    	public Thread(Runnable target):分配一个带有指定目标新的线程对象
    	public Thread(Runnable target,String name):分配一个带有指定目标新的线程对象并指定名字
    3.常用方法
    	public String getName():获取当前线程名称
    	public void start():导致此线程开始执行; Java虚拟机调用此线程的run方法
    	public void run():此线程要执行的任务在此处定义代码
    	public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停执行
    	public static Thread currentThread()  :返回对当前正在执行的线程对象的引用

需求:在测试类中演示线程的基本功能

*/
public class Test_01Thread基本使用 {
    public static void main(String[] args) throws InterruptedException {

//        Thread t = new Thread();
//        t.start();

        //直接使用Thread类创建对象无任何意义，因为没有重写run方法
        //Thread t2 = new Thread("zixiancheng");

        //public static Thread currentThread()  :返回对当前正在执行的线程对象的引用
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        //public void run():此线程要执行的任务在此处定义代码

        //start用于启动线程，run方法是启动线程后，线程中要执行的操作
        t.run();

        //public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停执行
        System.out.println("三秒后继续执行");
        Thread.sleep(3000);
        System.out.println("结束");


    }
}
