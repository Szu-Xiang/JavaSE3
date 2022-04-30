package com.itheima_03IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
1.介绍
	java.io.Reader抽象类表示字符输入流所有类的超类，规定了读取字符信息到内存的共性方法。
	java.io.FileReader 文件输入流，字符输入流常用子类，(使用默认的字符编码和字节缓冲区)将数据读取到内存中
2.构造方法
	FileReader(File file)：创建文件输入流以读取，由指定的File对象表示要连接的文件。
	FileReader(String name)：创建文件输入流以读取，由指定的文件路径名表示要连接的文件。
	注意:创建一个流对象时，必须传入文件路径，且该路径下，如果没有该文件,会抛出文件不存在异常。
3.常用方法
	public void close():关闭此输入流并释放与此流相关联的任何系统资源。
	public int read():从输入流读取数据的下一个字符。
	public int read(char[] cbuf):从输入流中读取一些字符数，并将它们存储到字符数组cbuf中。
需求:演示字符输入流读取文件内容。
 */
 public  class Test_10字符输入流基本使用 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("code/day10/resource/demo1/d.txt");

        int ch = -1;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();

        FileReader fr2 = new FileReader("code/day10/resource/demo1/d.txt");
        char[] chs = new char[2];
        int len = fr2.read(chs);
        System.out.println(Arrays.toString(chs));

    }
}
