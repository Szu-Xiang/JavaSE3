package com.itheima01_网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
1.需求:
	模拟网站服务器，使用浏览器访问自己编写的服务端程序，查看网页访问服务器效果。
2.分析
	web文件夹中提供了网页中的需要数据。
	根据操作效果，可以看到只要将index.html提供给浏览器，其他的内容自然会被加载的浏览器。
	服务器在获取到访问后，需要将以下内容返回给浏览器后，才能继续发送给浏览器数据。
 		"HTTP/1.1 200 OK\r\n" ：告诉浏览器访问成功。
 		"Content-Type:text/html\r\n"  ：告诉浏览器将以文本形式会传数据。
 		"\r\n"" ：作为头内容与正文的分隔标记。
3.注意事项
	浏览器加载图片,会重新开启一个线程访问服务器，所以服务器端需要加入多线程技术，及时响应浏览器的图片加载访问操作。
 */
public class Test_05BSServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        //创建连接，获取连接对象
        //创建网络输入流，获取路径
        //获取网络输出流
        //获取本地输入流，重复读取，并写出到浏览器
        //注意:由于图片需要多次重新申请服务器下载，需要使用多线程技术。

    }

}
