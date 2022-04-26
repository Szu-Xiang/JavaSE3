package HomeWork.HomeWork3.ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        HashMapThread1 t = new HashMapThread1();
        t.start();

        for (int i = 10; i < 20; i++) {
            t.map.put(i, i);
        }

        Thread.sleep(1000);


        System.out.println(t.map.size());//结果准确
    }
}
