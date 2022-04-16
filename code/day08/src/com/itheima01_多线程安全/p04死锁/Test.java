package com.itheima01_多线程安全.p04死锁;

/*
1.概述
	在多线程程序中,使用了多把锁,造成线程之间相互等待.程序不往下走了，即为死锁
	实际开发应尽量避免线程死锁。
2.死锁产生条件
	有多把锁
	有多个线程
	有线程同步嵌套

需求:演示死锁代码
*/
public class Test {
    public static void main(String[] args) {
        //定义两个对象作为锁对象
        Object lockA = new Object();
        Object lockB = new Object();
        //匿名内部类(重写run)创建线程对象，并启动
        new Thread() {
            @Override
            public void run() {
                int num1 = 0;
                while (true) {
                    synchronized (lockA) {
                        System.out.println("线程1:已获取A锁,等待获取B锁");
                        synchronized (lockB) {
                            System.out.println("线程1:已获取B锁");
                            System.out.println("线程1:执行第" + num1++ + "次");
                            System.out.println("线程1:等待释放B锁");
                        }
                        System.out.println("线程1:等待释放A锁");
                    }
                }
            }
        }.start();
        //匿名内部类(重写run)创建线程对象，并启动
        new Thread() {
            @Override
            public void run() {
                int num2 = 0;
                while (true) {
                    synchronized (lockB) {
                        System.out.println("线程2:已获取B锁,等待获取A锁");
                        synchronized (lockA) {
                            System.out.println("线程2:已获取A锁");
                            System.out.println("线程2:执行第" + num2++ + "次");
                            System.out.println("线程2:等待释放B锁");
                        }
                        System.out.println("线程2:等待释放A锁");
                    }
                }
            }
        }.start();
    }
}









