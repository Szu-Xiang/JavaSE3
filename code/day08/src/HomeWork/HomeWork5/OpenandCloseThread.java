package HomeWork.HomeWork5;

public class OpenandCloseThread extends Thread{
    volatile boolean flag;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag被修改为：" + flag);
    }
}
