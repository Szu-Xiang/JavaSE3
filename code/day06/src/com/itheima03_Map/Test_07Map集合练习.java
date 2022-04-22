package com.itheima03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
public class Test_07Map集合练习 {
    public static void main(String[] args) {
        //获取字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段内容：");
        String line = sc.nextLine();

        //定义一个Map集合，键表示字符，值表示字符的次数
        Map<Character, Integer> hm = new HashMap<>();

        //遍历字符串
        for (int i = 0; i < line.length(); i++) {
            //获取每个字符
            char c = line.charAt(i);
            //判断这个字符，在Map键中是否存在
            if(hm.containsKey(c)) {
                //该字符在键列中存在,将次数提取+1
                int count = hm.get(c);
                count++;
                //次数放回
                hm.put(c,count);
            } else {
                //该字符在键列中不存在
                hm.put(c,1);
            }

        }

        System.out.println(hm);

    }
}
