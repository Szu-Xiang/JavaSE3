package com.itheima02_并发包.p03CountDownLatch;

/*
1.概述
	CountDownLatch允许一个或多个线程等待其他线程完成操作
2.构造方法
	public CountDownLatch(int count)：初始化一个指定计数器的CountDownLatch对象
3.常用方法
	public void await() ： 让当前线程等待
	public void countDown()： 计数器进行减1,减到0时，处于await的线程被释放执行权。
需求:线程1要执行打印：A和C，线程2执行打印：B，但线程1在打印A后，等待线程2打印完B再打印C。
*/
public class Test {
    public static void main(String[] args) {

    }

}
