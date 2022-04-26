package HomeWork.HomeWork3.CopyonWriterArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class Test {
    public static void main(String[] args) {

        //若定义HashSet到最后会出现问题
        CopyOnWriteArraySet<Object> set = new CopyOnWriteArraySet<>();

        //创建子线程并启动
        ArraySetThread1 t1 = new ArraySetThread1();
        t1.start();

        for (int i = 100; i < 200; i++) {
            t1.set.add(i);
        }

        System.out.println(t1.set.size());

    }
}
