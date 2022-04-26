package HomeWork.HomeWork1;

//此类测试lock锁来实现窗口卖票

public class Test {
    public static void main(String[] args) {

        LockTicket t = new LockTicket();

        new Thread(t,"窗口1").start();
        new Thread(t,"窗口2").start();
        new Thread(t,"窗口3").start();
        new Thread(t,"窗口4").start();

    }


}
