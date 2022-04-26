package HomeWork.HomeWork4;

public class OpenCloseThread extends Thread{
    boolean flag = false;

    //重写run方法
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        flag = true;
        System.out.println("flag被更换成了：" + flag);
    }
}
