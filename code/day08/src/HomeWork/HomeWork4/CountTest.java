package HomeWork.HomeWork4;

public class CountTest {
    public static void main(String[] args) throws InterruptedException {
        //创建线程对象并启动
        CountThread t = new CountThread();
        t.start();

        //主线程
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            //同步机制解决原子性问题
            synchronized (t) {
                t.count ++;
            }
        }

        Thread.sleep(3000);

        //由于原子性，其结果并不为20000
        System.out.println(t.count);

    }
}
