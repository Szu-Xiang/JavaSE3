package HomeWork.HomeWork1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTicket implements Runnable {

    int ticket = 100;
    //定义一个Lock锁
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //上锁
            lock.lock();
            if (ticket > 0) {
                //执行卖票的操作
                System.out.println(Thread.currentThread().getName() + "正在卖出第" + (101 - ticket) + "张票");
                //票数减少1张
                ticket--;
            } else {
                break;
            }
            lock.unlock();
        }

    }
}
