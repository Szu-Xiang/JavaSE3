package com.itheima02_并发包.p04CyclicBarrier;

/*
1.概述
	允许一组线程全部等待彼此达到共同屏障点的同步辅助
	CyclicBarrier的字面意思是可循环使用（Cyclic）的屏障（Barrier）
2.构造方法
	public CyclicBarrier(int parties, Runnable barrierAction)： 创建同步辅助操作任务类的对象
		parties指同时达到指定位置的线程数量,barrierAction指数量达到后的操作
3.常用方法
	public int await()： 线程调用await方法告诉CyclicBarrier到达了屏障，然后当前线程被阻塞
需求:定义一个开会线程，一个员工线程，演示5名员工开会，等5名员工都到了，会议开始。
*/
public class Test {
    public static void main(String[] args) {


    }
}

