package HomeWork.HomeWork2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapKey {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1,"张三");
        hm.put(2,"李四");
        hm.put(10,"王武");

        //键值对遍历
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);
        }

        //键找值遍历
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            String value = hm.get(key);
            System.out.println(key + " " + value);
        }
    }
}

