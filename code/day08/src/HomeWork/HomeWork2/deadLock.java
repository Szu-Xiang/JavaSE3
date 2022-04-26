package HomeWork.HomeWork2;

/*
    需求：演示一下死锁
 */

public class deadLock {
    public static void main(String[] args) {
        //死锁条件：1. 有多把锁 2.有多个线程 3.有线程同步嵌套

        //创建两个锁
        Object lockA = new Object();
        Object lockB = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lockA) {
                        System.out.println("线程1 获得lockA");
                        //嵌套
                        synchronized (lockB) {
                            System.out.println("线程1 获得lockB");
                        }
                    }
                }

            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (lockB) {
                        System.out.println("线程2 获得lockB");
                        //嵌套
                        synchronized (lockA) {
                            System.out.println("线程2 获得lockA");
                        }
                    }
                }

            }
        }.start();

        //结果为： 线程1 获得lockA  线程2 获得lockB
        //程序死锁，任一线程不会得到另一个锁对象
    }
}
