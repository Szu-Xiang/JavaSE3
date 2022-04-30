package com.itheima01_IO流扩展;

import java.io.*;

/*
缓冲流概述
    1.介绍
    	缓冲流能够进行高效读写,也叫高效流，是对4个基本的`FileXxx` 流的包装和增强，所以也分为4个流
    	缓冲流基本原理，是在创建流对象时，创建内置默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，提高读写的效率。
    	查询API，可以发现缓冲流读写方法与基本的流一致，可以通过计算操作时间判断不同流的使用效率。
    2.分类
    	字节缓冲流：BufferedInputStream，BufferedOutputStream
    	字符缓冲流：BufferedReader，BufferedWriter。
字节缓冲流
    1.构造方法
	    public BufferedInputStream(InputStream in):创建一个新的字节缓冲输入流。
	    public BufferedOutputStream(OutputStream out)：创建一个新的字节缓冲输出流。
    2.常用方法
	    参考FileInputStream、FileOutputStream
	需求:分别通过普通字节流和缓冲字节流，以单个读取，数组读取测试读写一个5M图片效率上的差别。
字符缓冲流
    1.构造方法
    	public BufferedReader(Reader reader):创建一个新的字节缓冲输入流。
        public BufferedWriter(Writer writer)：创建一个新的字节缓冲输出流。
    2.特有方法
    	BufferedReader类：public String readLine(): 读一行文字，读取不到内容，返回null。
    	BufferedWriter类：public void newLine(): 写一行行分隔符,由系统属性定义符号。
    需求:将黑马程序员每个字逐行写入文本，再文件中一次读取一行内容。

 */
 public  class Test_03缓冲流 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/gouhaoxiang/JavaSE2/code/day11/src/a.txt"));

        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/gouhaoxiang/JavaSE2/code/day11/src/b.txt"));
        bw.write("你");
        bw.newLine();
        bw.write("好");
        bw.newLine();
        bw.write("啊");

        bw.close();

    }
}
