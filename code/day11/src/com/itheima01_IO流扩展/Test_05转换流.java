package com.itheima01_IO流扩展;

import java.io.*;
import java.util.Arrays;

/*
转换流概述
    1.介绍
    	转换流能够进行转换编码，同一个系统中，输出输入流默认使用系统定义的编码。
    	不同的系统，进行读取，可能会出现编码不同而导致的乱码问题。
    	如何保证拷贝到的内容正确，是转换流可以解决的问题。需要理解编码和读写的数据之间的关系。
    2.字符编码
    	字符编码Character Encoding : 是一套自然语言的字符与二进制数之间的对应规则。
    	计算机中的信息都是以二进制数储存，我们看到的数字、英文、标点、汉字等字符是二进制数转换之后的结果。
    	编码(字符-->二进制数):按照指定规则，将字符用对应数值存储到计算机中，称为编码 。
    	解码(二进制数-->字符):将计算机中的二进制数按照指定规则解析出来，称为解码 。
    	按照A规则存储，按照A规则解析，就能显示正确的文本。反之，按照A规则存储，按照B规则解析，就会出现乱码现象。
    3.字符集
    	字符集 Charset：也叫编码表。是一个系统支持的所有字符的集合，包括各国家文字、标点、图形、数字等。
    	计算机要准确存储和识别各种字符集符号，需要进行字符编码，一套字符集至少有一套字符编码。
    	常见字符集有ASCII字符集、GBK字符集、Unicode字符集等。指定了编码，对应的字符集就指定了，关注编码即可。
    	常见字符集:ASCII字符集、ISO-8859-1字符集、GBxxx字符集、Unicode字符集
    需求:演示IDEA使用FileInputStream读取GBKcontent.txt，显示到控制台上的乱码问题
转换输入流
    1.概述
    	java.io.InputStreamReader转换输入流，Reader的子类。是从字节流到字符流的桥梁。
    	可以指定字符集读取字节将其解码为字符，它的字符集可由名称指定，也可接受平台的默认字符集。
    2.构造方法
    	InputStreamReader(InputStream in): 创建使用默认字符集的字符输入流。
    	InputStreamReader(InputStream in, String charsetName): 创建指定字符集的字符输入流。
    需求:使用默认编码与指定编码读取GBKcontent.txt，并显示到控制台
转换输出流
    1.概述
    	java.io.OutputStreamWriter 转换输出流，是Writer的子类，是字符流到字节流的桥梁。
    	可以指定字符集写出字符将其编码为字节。它的字符集可由名称指定，也可接受平台的默认字符集。
    2.构造方法
    	OutputStreamWriter(OutputStream in): 创建使用默认字符集的字符输出流。
    	OutputStreamWriter(OutputStream in, String charsetName): 创建指定字符集的字符输出流。
    需求:使用默认编码与指定编码将"黑马程序员"写出到文件中。
 */
 public  class Test_05转换流 {
    public static void main(String[] args) throws Exception {
//        //不同码表存储中文的字节个数不同
//        System.out.println("你-->UTF-8：" + "你".getBytes("UTF-8").length);
//        System.out.println("你-->UTF-8：" + Arrays.toString("你".getBytes("UTF-8")));
//        System.out.println("你-->UTF-8：" + Integer.toBinaryString("你".getBytes("UTF-8")[0]));//11100100
//        System.out.println("你-->UTF-8：" + Integer.toBinaryString("你".getBytes("UTF-8")[1]));//10111101
//        System.out.println("你-->UTF-8：" + Integer.toBinaryString("你".getBytes("UTF-8")[2]));//10100000
//        //1110"0100"-->"0100" 10"111101"-->"111101" 10"100000"-->"100000"
//        //"0100" "111101" "100000" -->"0100" "1111" "0110" "0000"
//        // "0100":4 "1111":f "0110":6 "0000":0 -->  4f60行 0列
//        System.out.println("你-->GBK：" + "你".getBytes("GBK").length);
//        System.out.println("你-->GBK：" + Arrays.toString("你".getBytes("GBK")));
//        System.out.println("你-->GBK：" + Integer.toBinaryString("你".getBytes("GBK")[0]));//11000100
//        System.out.println("你-->GBK：" + Integer.toBinaryString("你".getBytes("GBK")[1]));//11100011
//        //1100:C 0100:4 1110:E 0011:3-->C4区E行3列

        //以GBK转换为utf-8

        //用GBK读数据
        InputStreamReader is = new InputStreamReader(new FileInputStream("/Users/gouhaoxiang/JavaSE2/code/day11/src/GBKcontent.txt"),"gbk");

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/gouhaoxiang/JavaSE2/code/day11/src/UTF-8content.txt"), "utf8");

        int ch = -1;
        while ((ch = is.read()) != -1) {
            osw.write(ch);
        }

        osw.close();
        is.close();


    }
}
