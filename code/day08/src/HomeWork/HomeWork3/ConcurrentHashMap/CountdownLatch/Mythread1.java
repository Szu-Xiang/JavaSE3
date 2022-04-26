package HomeWork.HomeWork3.ConcurrentHashMap.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class Mythread1 extends Thread{
    private CountDownLatch c;


    public Mythread1() {
    }

    public Mythread1(CountDownLatch c) {
        this.c = c;
    }

    /**
     * 获取
     * @return c
     */
    public CountDownLatch getC() {
        return c;
    }

    /**
     * 设置
     * @param c
     */
    public void setC(CountDownLatch c) {
        this.c = c;
    }

    public String toString() {
        return "Mythread1{c = " + c + "}";
    }

    @Override
    public void run() {
        System.out.println("开始计算");

        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("计算完毕");
    }

}
