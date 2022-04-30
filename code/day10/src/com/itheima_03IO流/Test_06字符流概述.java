package com.itheima_03IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/*
1.为什么需要字符流
	一个中文字符可能占用多个字节存储。
	使用字节流读取文本文件时，如果遇到中文字符时，可能不会显示完整的字符。
2.字符流分类
	字符输入流:
 		以字符为单位从硬盘读取数据到内存中。
 		内存中数据的在程序结束后清空。
 		所有字符输入流都是Reader间接或直接子类。
	字符输出流:
 		以字符为单位从内存写出数据到硬盘中。
 		硬盘中数据的在程序结束后可以持久存储。
 		所有字符输出流都是Writer间接或直接子类。
需求:演示字节流读取字符内容并展示过程中的问题。
 */
 public  class Test_06字符流概述 {
    public static void main(String[] args) throws IOException {
        //使用字节流读取中文数据
        FileInputStream fis = new FileInputStream("code/day10/resource/demo1/c.txt");

        //数组读取
        int len = -1;
        byte[] bys = new byte[4];
        len = fis.read(bys);
        System.out.println(new String(bys,0,len));//输出乱码

    }
}
