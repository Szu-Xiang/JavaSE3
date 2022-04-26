package HomeWork.HomeWork1;

public class MyThread implements Runnable{

    int ticket = 100;

    @Override
    public void run() {
        //加循环，重复卖票
        while (true) {
            //排队，等一会
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //同步代码块改写
           synchronized (this) {
               //判断，如果有票，才卖票
               if (ticket > 0) {
                   //执行卖票的操作
                   System.out.println(Thread.currentThread().getName() + "正在卖出第" + (101 - ticket) + "张票");
                   //票数减少1张
                   ticket--;
               }
           }
        }
    }
}
