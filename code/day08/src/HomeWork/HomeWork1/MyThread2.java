package HomeWork.HomeWork1;

public class MyThread2 implements Runnable{

    int ticket = 100;
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sellTicket();
        }
    }

    public synchronized void sellTicket() {
        if (ticket > 0) {
            //执行卖票的操作
            System.out.println(Thread.currentThread().getName() + "正在卖出第" + (101 - ticket) + "张票");
            //票数减少1张
            ticket--;
        }
    }
}
