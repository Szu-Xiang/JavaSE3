package HomeWork.HomeWork6;

import java.util.concurrent.atomic.AtomicInteger;

public class CountThread extends Thread{
    AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.incrementAndGet();
        }
    }
}
