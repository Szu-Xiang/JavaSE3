package HomeWork.HomeWork3.CopyonWriterArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetThread1 extends Thread{

    CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<Integer>();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }
}
