package HomeWork.HomeWork3.ConcurrentHashMap.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
        CountDownLatch c = new CountDownLatch(1);

        //启动线程
        new Mythread1(c).start();
        new Mythread2(c).start();

    }
}
