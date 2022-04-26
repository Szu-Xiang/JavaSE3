package HomeWork.HomeWork3.ConcurrentHashMap.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class Mythread2 extends Thread{
    private CountDownLatch c;


    public Mythread2() {
    }

    public Mythread2(CountDownLatch c) {
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
        return "Mythread2{c = " + c + "}";
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        //计时器，倒计时为0执行Mythread1
        c.countDown();
    }
}
