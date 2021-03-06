package com.itheima_03IO流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
1.介绍
	java.io.Writer抽象类表示字符输出流所有类的超类,规定了字符信息写到目的地的共性方法。
	java.io.FileWriter文件输出流，字符输出流常用子类，(使用默认的字符编码和字节缓冲区)将数据写出到文件
2.构造方法
	public FileWriter(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
	public FileWriter(String name):创建文件输出流以指定的名称写入文件。
3.常用方法
	public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
	public void flush()：刷新此输出流并强制任何缓冲的输出字符被写出。
	public void write(char cbuf)：将指定的字符写入此输出流。
	public void write(char[] cbuf)：将 b.length字符从指定的字符数组写入此输出流。
	public void write(char[] cbuf, int off, int len)：从指定字符数组,按照偏移量写入len个字符。
    public void write(String str):写出一个字符串。
    public void write(String str, int off, int len) ，每次可以写出一个字符串的指定范围
需求:演示字符出流的基本使用。
*/
 public  class Test_07字符输出流基本使用 {
    public static void main(String[] args) throws IOException {
//        File f = new File("code/day10/resource/demo1/c.txt");
//        FileWriter fw = new FileWriter(f);
//
//        FileWriter fw1 = new FileWriter("code/day10/resource/demo1/d.txt");

        //public void write(char cbuf)：将指定的字符写入此输出流。
        FileWriter fw = new FileWriter("code/day10/resource/demo1/d.txt");
        fw.write('黑');
        fw.write('马');
        fw.write('程');
        fw.write('序');
        //public void flush()：刷新此输出流并强制任何缓冲的输出字符被写出。


        //public void write(char[] cbuf)：将 b.length字符从指定的字符数组写入此输出流。
        char[] chs = {'有', '线', '网', '络'};
        //fw.write(chs);

        //public void write(char[] cbuf, int off, int len)：从指定字符数组,按照偏移量写入len个字符。
        fw.write(chs,1,3);

        //public void write(String str):写出一个字符串。
        //public void write(String str, int off, int len) ，每次可以写出一个字符串的指定范围

        fw.flush();//必须使用!!但是close方法中包括了flush，所以调用close即可
    }
}
