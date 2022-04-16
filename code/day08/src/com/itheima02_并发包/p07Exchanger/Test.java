package com.itheima02_并发包.p07Exchanger;


/*
1.概述
	Exchanger（交换者）是一个用于线程间协作的工具类，用于进行线程间的数据交换
2.构造方法
	public Exchanger() 创建用于线程间交换数据的对象
3.常用方法
	public V exchange(V x)： 交换数据的方法  把参数的数据传递给另一条线程,返回另一条线程传递过来的数据
	public V exchange(V x, long timeout, TimeUnit unit)
        		x - 要交换的对象
        		timeout - 等待的最长时间
        		unit - timeout参数的时间单位(TimeUnit.SECONDS 秒单位)
需求:定义A线程，模拟送出礼物，演示exchange阻塞特性
*/
public class Test {
    public static void main(String[] args) {

    }
}
