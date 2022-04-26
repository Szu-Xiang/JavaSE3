package HomeWork.HomeWork4;

public class OpenCloseThread2 extends Thread{
    volatile boolean flag;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;

        System.out.println("flag被修改为：" + flag);
    }
}
