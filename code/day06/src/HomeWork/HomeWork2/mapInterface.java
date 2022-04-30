package HomeWork.HomeWork2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    请按以下要求顺序编码：
定义一个：键Integer，值String类型的HashMap集合
        存储以下数据：
        1，”张三”
        2，“李四”
        10，“王五”
        打印集合大小；
        使用“键找值”的方式遍历集合，打印键和值；
        使用“键值对”的方式遍历集合，打印键和值；
        获取键为1的值，并打印
        获取键为10的值，并打印
        判断集合中是否有键：10
        删除键为1的键值对，删除完毕打印集合

 */
public class mapInterface {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"张三");
        hm.put(2,"李四");
        hm.put(10,"王武");

        int size = hm.size();
        System.out.println("集合大小为：" + size);

        System.out.println();
        //键找值方式遍历
        Set<Integer> keys = hm.keySet();
        System.out.println("键找值方式，键值对为：");
        for (Integer key : keys) {
            String value = hm.get(key);

            System.out.println(key +  " " + value);

        }

        System.out.println();
        //键值对方式遍历
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        System.out.println("键值对遍历方式，键值对为：");
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);
        }

        //获取键为1的值，并打印
        String value = hm.get(1);
        System.out.println("键为1的值为： " + value);

        //获取键为11的值，并打印
        String value2 = hm.get(11);
        System.out.println("键为11的值为： " + value2);//结果为null

        //判断集合中是否有键：10
        boolean b = hm.containsKey(10);
        System.out.println("是否有键为10？:" + b);

        //删除键为1的键值对，删除完毕打印集合
        hm.remove(1);
        System.out.println("删除键1之后的集合：" + hm);


    }
}
