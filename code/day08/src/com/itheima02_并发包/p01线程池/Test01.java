package com.itheima02_并发包.p01线程池;

/*
线程池概述
    1.线程池思想
    	当出现并发数量大，线程任务简单，就会造成系统短时间大量创建线程对象，造成资源浪费。
    	如果可以使得创建出来的线程对象能够重复被利用，可以避免因为大量创建对象，导致内存浪费。
    2.线程池概念
    	一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。
    	工作线程:线程池中存储的线程对象，在没有任务时，出于等待状态，可循环使用。
    	任务队列:用于存放没有处理的任务，一种缓冲机制。
    	任务接口:每个任务必须实现的接口，以供工作线程调度任务的执行。
    	线程池管理器:用于创建并管理线程池，包括创建线程池，销毁线程池，添加新任务
    3.线程池好处
    	降低资源消耗。
    	提高响应速度。
    	提高线程的可管理性。

线程池的使用
    1.概述
    	java.util.concurrent.Executor.是线程池的顶级接口。
    	java.util.concurrent.ExecutorService.严格意义上讲，ExecutorService才是真正的线程池接口。
    2.创建对象
        java.util.concurrent.Executors.线程工厂类，提供了一些静态工厂，生成一些常用的线程池。
    	public static ExecutorService newFixedThreadPool(int nThreads)  Executors的静态方法，返回线程池对象
    3.常用方法
    	public Future<?> submit(Runnable task):获取线程池中的某一个线程对象，并执行
    	public Future<?> submit(Callable task):获取线程池中的某一个线程对象，并执行。
    	Future接口：用来记录线程任务执行完毕后产生的结果(V get(): 获取计算完成的结果)。
    4.使用步骤
    	创建线程池对象。
    	创建Runnable/Callable接口实现类对象。(task)
    	提交Runnable/Callable接口实现类对象。(submit(task))
    	接收运行结果(由于Runnable的run方法没有返回值，所以提交该接口给线程池无法返回结果)
    	关闭线程池(一般不做)
需求:使用线程池返回一个随机数(Math.random())演示有无返回值的区别。

*/
public class Test01 {
    public static void main(String[] args) {

    }
}
