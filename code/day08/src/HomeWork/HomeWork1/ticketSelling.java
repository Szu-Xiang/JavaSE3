package HomeWork.HomeWork1;

public class ticketSelling {
    public static void main(String[] args) {
        //创建任务对象
        //MyThread——同步代码块
        //MyThread t = new MyThread();

        //Mythread2——同步方法
        MyThread2 t = new MyThread2();

        //创建线程对象并启动
        new Thread(t,"窗口1").start();
        new Thread(t,"窗口2").start();
        new Thread(t,"窗口3").start();
        new Thread(t,"窗口4").start();

    }
}
