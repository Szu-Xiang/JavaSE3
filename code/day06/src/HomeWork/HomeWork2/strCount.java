package HomeWork.HomeWork2;

import java.util.HashMap;
import java.util.Scanner;

/*
    有以下字符串：
		String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
	请编程统计每个字符出现的次数

 */
public class strCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();

        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";

        for (int i = 0; i < str.length(); i++) {
            //获取每个字符
            char c = str.charAt(i);
            //判断集合中是否有值为c的键
            if(hm.containsKey(c)) {
                //如果有，则计数+1
                Integer count = hm.get(c);
                count ++;
                //放回
                hm.put(c,count);
            } else {
                //如果没有，添加进入集合，并赋值值为1
                hm.put(c,1);
            }
        }

        System.out.println(hm);


    }
}
