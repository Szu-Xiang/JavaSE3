package HomeWork.HomeWork3.Exchange;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AThread extends Thread{
    private Exchanger<String> e;


    public AThread() {
    }

    public AThread(Exchanger<String> e, String name) {
        super(name);
        this.e = e;
    }

    /**
     * 获取
     * @return e
     */
    public Exchanger<String> getE() {
        return e;
    }

    /**
     * 设置
     * @param e
     */
    public void setE(Exchanger<String> e) {
        this.e = e;
    }

    public String toString() {
        return "AThread{e = " + e + "}";
    }

    @Override
    public void run() {
        try {
            String result = e.exchange("体育新闻",3, TimeUnit.SECONDS);
            System.out.println("A线程给B线程一条：" + result);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
    }
}
