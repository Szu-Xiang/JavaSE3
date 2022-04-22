package com.HomeWork;
/*
    1.需求:输入一个字符串，统计字符串中每个字符出现次数。
2.分析
	获取一个字符串对象
	创建一个Map集合，键代表字符，值代表次数。
	遍历字符串得到每个字符。
	判断Map中是否有该键(public boolean containKey(Object key))
 		如果没有，第一次出现，存储次数为1；
 		如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
	打印最终结果。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        System.out.println("请输入一段内容：");
        //获取一个字符串对象
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        //创建一个Map集合，键代表字符，值代表次数。
        Map<Character, Integer> map = new HashMap<>();

        //遍历字符串得到每个字符。
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //判断是否存在
            if(map.containsKey(c)) {
                int count = map.get(c);
                count ++;
                //键值对更新后放回
                map.put(c,count);
                //不存在则新建key，value设置为1
            } else {
                map.put(c,1);
            }
        }

        System.out.println(map);

    }
}
