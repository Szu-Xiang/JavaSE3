package com.itheima_01File;

import java.io.File;

/*
1.获取绝对路径
	public String getAbsolutePath():返回此File的绝对路径名字符串
2.绝对路径
	从盘符开始的路径，这是一个完整的路径,表示文件或目录的具体位置。
	举例:D://a.txt    实际路径  D://a.txt
3.相对路径
	相对于项目某个目录的路径。java中一般相对于目录的路径，是一种灵活的用法，开发中常用
	举例:a.txt  实际路径  盘符://...//项目目录//a.txt
需求:演示相对路径和绝对路径表示当前模块下的a.txt文件

 */
 public  class Test_02相对路径与绝对路径 {
    public static void main(String[] args) {

        //相对性: Java中 一般相对路径是相对于项目路径

        //项目路径的上一级路径
        File f1 = new File("..\\");
        System.out.println(f1.getAbsolutePath());

        //项目路径的当前路径
        File f2 = new File("");
        System.out.println(f2.getAbsolutePath());

        //绝对路径
        File f5 = new File("/Users/gouhaoxiang/JavaSE2");
    }
}
