package com.itheima_03IO流;

/*
IO流概述
    1.概述
    	把视屏从优盘拷贝到电脑，我们把这种数据的传输，看做是一种数据的流动。
    	按照流动的方向，以内存为基准，分为输入input 和输出output 。
    	即流向内存是输入流，流出内存的输出流。
    2.IO流分类  见《IO流理解》
    	根据数据的流向分为：输入流和输出流。
     		输入流 ：把数据从其他设备上读取到内存中的流。
     		输出流 ：把数据从内存 中写出到其他设备上的流。
    	根据数据的类型分为：字节流和字符流。
     		字节流 ：以字节为单位，读写数据的流。
     		字符流 ：以字符为单位，读写数据的流。
    3.IO流顶层接口
    	字节流: 字节输入流(InputStream)   字节输出流(OutputStream)
    	字符流：字符输入流(Reader)        字符输出流(Writer)
字节流概述
    1.一切皆字节
    	一切文件数据(文本、图片、视频等)存储时，都是以一个个字节(二进制)形式保存，传输时也一样
    	字节流可以传输任意文件数据，无论使用什么样的流对象，底层传输的始终为二进制数据
    2.字节流分类
    	字节输入流:
     		以字节为单位从硬盘读取数据到内存中。
     		内存中数据的在程序结束后清空。
     		所有字节输入流都是InputStream间接或直接子类。
    	字节输出流:
     		以字节为单位从内存写出数据到硬盘中。
     		硬盘中数据的在程序结束后可以持久存储。
     		所有字节输出流都是OutputStream间接或直接子类。
字节输出流基本使用
    1.介绍
    	java.io.OutputStream 抽象类表示字节输出流所有类的超类,规定了字节信息写到目的地的共性方法。
    	java.io.FileOutputStream 文件输出流，字节输出流常用子类，用于将数据写出到文件
    2.构造方法
    	public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
    	public FileOutputStream(String name):创建文件输出流以指定的名称写入文件。
    3.常用方法
    	public void close()：关闭此输出流并释放与此流相关联的任何系统资源。
    	public void flush()：刷新此输出流并强制任何缓冲的输出字节被写出。
    	public void write(int b)：将指定的字节写入此输出流。
    	public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
    	public void write(byte[] b, int off, int len)：从指定字节数组,按照偏移量写入len个字节。
需求:演示字节输出流的基本使用。
 */
 public  class Test_01字节输出流基本使用 {
    public static void main(String[] args) {

    }
}
