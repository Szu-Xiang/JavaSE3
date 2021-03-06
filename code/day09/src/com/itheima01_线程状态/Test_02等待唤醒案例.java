package com.itheima01_线程状态;

/*
1.需求:利用等待唤醒机制，在多线程环境下，演示如何有效利用资源开展包子的生产和消费过程。
2.分析
	包子类定义开关变量，标记包子的状态。
	(无包子)包子铺线程生产包子，(有包子)吃货线程消费包子。
	通过判断包子的状态，控制包子铺线程和吃货线程交替任务执行。
3.思路
	包子类:包子状态为true,表示有包子，为false表示无包子。
	吃货线程
        		没包子时，包子状态为false，吃货线程进入等待(将执行权交给包子铺做包子)。
        		有包子时，包子状态为true，吃货线程吃完包子，包子状态为false，唤醒包子铺线程
	包子铺线程
        		有包子时，包子状态为true，包子铺线程进入等待(将执行权交给吃货吃包子)。
        		没包子时，包子状态为false，包子铺线程生产包子，包子状态为true，唤醒吃货线程。
*/
public class Test_02等待唤醒案例 {
    public static void main(String[] args) {

    }
}
