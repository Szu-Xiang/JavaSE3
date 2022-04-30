package com.itheima01_线程状态;

/*
1.概述
	当线程被创建并启动以后，它既不是一启动就进入了执行状态，也不是一直处于执行状态。
	按照线程状态的转变过程，分为了6个阶段，这个过程也成为线程的生命周期，见《多线程生命周期图》
2.线程状态相关方法
	Thread类的计时等待:public static void  sleep(long time)  让当前线程进入到睡眠状态，到毫秒后自动醒来继续执行。
	Object类的等待唤醒:等待唤醒功能的调用者必须是锁对象。
		public void wait()  让当前线程进入到等待状态 此方法必须锁对象调用.无唤醒，将进入无线等待。
		public void wait(long time)  让当前线程进入到等待状态 此方法必须锁对象调用.无唤醒，超时后自动唤醒。
		public void notify()  唤醒当前锁对象上等待状态的线程.
*/
public class Test_01等待唤醒 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始");
        Object lock = new Object();
        synchronized (lock) {
            lock.wait(2000);
            System.out.println("结束");
        }
    }
}
