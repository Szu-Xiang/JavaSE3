package HomeWork.HomeWork3.CopyonWriterArraySet.Semaphore;

import java.util.concurrent.Semaphore;

public class visitThread extends Thread{
    private Semaphore s;

    public visitThread() {
    }

    public visitThread(Semaphore s) {
        this.s = s;
    }

    /**
     * 获取
     * @return s
     */
    public Semaphore getS() {
        return s;
    }

    /**
     * 设置
     * @param s
     */
    public void setS(Semaphore s) {
        this.s = s;
    }

    public String toString() {
        return "visitThread{s = " + s + "}";
    }

    @Override
    public void run() {

        //等待参观
        try {
            s.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //获得了参观的机会，开始参观
        System.out.println(getName() + "参观中...");
        //参观两秒钟
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //参观结束，释放空间
        s.release();
    }
}
