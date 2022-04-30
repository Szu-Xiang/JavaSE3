package com.itheima_03IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
1.概述
	创建输出流对象，指定路径的文件内容会被清空。想要保留目标文件中原来的数据，需要使用特定的构造方法
2.构造方法
	public FileOutputStream(File file, boolean append):创建文件输出流以写入由指定的 File对象表示的文件。
	public FileOutputStream(String name, boolean append):创建文件输出流以指定的名称写入文件。
	append的值，true 表示追加数据，false 表示清空原有数据。
需求:在已经存在ab的文件中，补充写入cde

 */
 public  class Test_02字节输出流追加写入 {
    public static void main(String[] args) throws IOException {
        //public FileOutputStream(String name, boolean append):创建文件输出流以指定的名称写入文件。
        //append的值，true 表示追加数据，false 表示清空原有数据。
        FileOutputStream fos = new FileOutputStream("code/day10/resource/demo1/a.txt",true);

        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();


    }
}
