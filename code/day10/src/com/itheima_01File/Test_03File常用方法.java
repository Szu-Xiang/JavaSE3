package com.itheima_01File;

import java.io.File;
import java.io.IOException;

/*
1.创建功能
	public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件，该文件的父级目录需要先存在。
	public boolean mkdir()：创建由此File表示的目录，该目录的父级目录需要先存在。
	public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录。
2.获取功能
	public String getAbsolutePath()：返回此File的绝对路径名字符串。
	public String getPath()：将此File转换为路径名字符串。
	public String getName()：返回由此File表示的文件或目录的名称。
	public long   length()   ：返回由此File表示的文件的长度。
3.判断功能
	public boolean exists()：此File表示的文件或目录是否实际存在。
	public boolean isDirectory()：此File表示的是否为目录。
	public boolean isFile()：此File表示的是否为文件。
4.删除功能
	public boolean delete()：删除由此File表示的文件或目录。
需求:演示相对路径，演示File类中的方法。
 */
 public  class Test_03File常用方法 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("com/itheima_01File/b.txt");

        System.out.println(f1.createNewFile());
    }
}
