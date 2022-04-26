package HomeWork.HomeWork3.CopyonWriterArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListThread extends Thread{
    CopyOnWriteArrayList<Object> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            list.add(i);
            System.out.print("第一个线程，添加1～100：");
            System.out.println(list.get(i - 1));
        }
    }
}
