package HomeWork.HomeWork3.CopyonWriterArraySet.Semaphore;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        //请使用Semaphore编写一个程序，实现以下效果：有10名游客要参观展览室，
        // 而“展览室”同时只允许最多“三个游客”参观，每个游客参观时间2秒。
        //最多允许三个人参观
        Semaphore s = new Semaphore(3);
        //创建线程对象
        for (int i = 0; i < 10; i++) {
            new visitThread(s).start();
        }

    }
}
