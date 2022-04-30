package com.itheima01_IO流扩展;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
1.需求:
	请将sort.txt文本信息恢复顺序。
2.分析
	①逐行读取文本信息。提示:字符缓冲输入流readLine方法
	②将文本信息拆成序号和内容，以键值对存储到集合中。提示:String的split方法
	③遍历集合，将排好序的文本信息，按照每个文本信息一行，写出到文件中。提示：字符输出流newLine方法。

 */
 public  class Test_04缓冲流练习 {
    public static void main(String[] args) throws Exception {
        TreeMap<String, String> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/gouhaoxiang/JavaSE2/code/day11/src/sort.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            //将每一行的数据拆分成两部分
            String[] contents = line.split("\\.");
            //System.out.println(contents[0] + "==" + contents[1]);

            //前面序号为键，文本作为内容
            map.put(contents[0], contents[1]);
        }
        //遍历TreeMap集合，自动排序
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            //重新拼接键值对
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "." + value);
        }

        //排序好后重新写会文件中

    }
}
