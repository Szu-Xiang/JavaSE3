package HomeWork.HomeWork3.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class HashMapThread1 extends Thread{
    ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
    }
}
