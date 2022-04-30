package com.itheima_01File;

import java.io.File;
import java.io.IOException;

/*
常用方法
	public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
    public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
需求:获取指定目录下的文件和目录

 */
 public  class Test_04File遍历 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/gouhaoxiang/JavaSE2/code/day10/resource/demo1/a.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
    }
}
