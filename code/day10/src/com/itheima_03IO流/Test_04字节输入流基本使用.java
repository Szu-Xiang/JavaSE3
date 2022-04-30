package com.itheima_03IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
1.介绍
	java.io.InputStream抽象类表示字节输入流所有类的超类，规定了读取字节信息到内存的共性方法。
	java.io.FileInputStream 文件输入流，字节输入流常用子类，将数据读取到内存中
2.构造方法
	FileInputStream(File file)：创建文件输入流以读取，由指定的File对象表示要连接的文件。
	FileInputStream(String name)：创建文件输入流以读取，由指定的文件路径名表示要连接的文件。
	注意:创建一个流对象时，必须传入文件路径，且该路径下，如果没有该文件,会抛出文件不存在异常。
3.常用方法
	public void close():关闭此输入流并释放与此流相关联的任何系统资源。
	public int read():从输入流读取数据的下一个字节。
	public int read(byte[] b):从输入流中读取一些字节数，并将它们存储到字节数组b中节。
需求:演示字节输入流读取文件内容。
 */
 public  class Test_04字节输入流基本使用 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("code/day10/resource/demo1/c.txt");

//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());

//        int by = -1;
//        while ((by = fis.read()) != -1) {
//            System.out.println((char) by);
//        }
        //fis.close();

        //public int read(byte[] b):从输入流中读取一些字节数，并将它们存储到字节数组b中节。
        byte[] bys = new byte[2];
        int len = fis.read(bys);
        System.out.println(len);
        System.out.println(Arrays.toString(bys));

    }
}
