package com.itheima01_IO流扩展;

import java.io.IOException;

/*
1.概述
	commons-io是apache开源基金组织提供的一组有关IO操作的类库，可以提高IO功能开发的效率。
    包	                                功能描述
    org.apache.commons.io	            有关Streams、Readers、Writers、Files的工具类
    org.apache.commons.io.input	        输入流相关的实现类，包含Reader和InputStream
    org.apache.commons.io.output	    输出流相关的实现类，包含Writer和OutputStream
    org.apache.commons.io.serialization	序列化相关的类
2.使用步骤
	①下载commons-io相关jar包:http://commons.apache.org/proper/commons-io/
	②把commons-io-2.6.jar包复制到指定的Module的lib目录中
	③将commons-io-2.6.jar加入到classpath中。
3.常用类和方法
	IOUtils:位于org.apache.commons.io的工具类，封装了对于IO的读写方法。
     	    static int copy(InputStream in,OutputStream out):把in读取的内容写出到out指定的路径中，返回拷贝的字节个数(适合2GB以下)
     	    static long copyLarge(InputStream in,OutputStream out):把in读取的内容写出到out指定的路径中，返回拷贝的字节个数(适合2GB以上)
	FileUtils:位于org.apache.commons.io的工具类，封装了对于文件的读写方法。
     	    static void copyFileToDirectory(final File srcFile,final File destFile) :将srcFile文件拷贝到destFile目录下。
     	    static void copyDirectoryToDirectory(File file1 ,File file2 ):将file1目录拷贝到file2目录下。
需求:演示IOUtils工具类与FileUtils工具类复制案例
 */
 public  class Test_08commons {
    public static void main(String[] args) throws IOException {

    }
}
