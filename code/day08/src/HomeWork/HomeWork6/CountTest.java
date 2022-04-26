package HomeWork.HomeWork6;

public class CountTest {
    public static void main(String[] args) throws InterruptedException {
        //创建子线程并启动
        CountThread t = new CountThread();
        t.start();

        //主线程
        for (int i = 0; i < 1000; i++) {
            t.count.incrementAndGet();
        }

        Thread.sleep(3000);

        //通过原子类来解决了原子性问题：验证得到2000
        System.out.println(t.count);
    }
}
