package com.itheima01_网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
TCP协议概述
    1.概述
    	TCP(Transmission Control Protocol)是面向连接通信协议，数据发送前，发送端和接收端先建立逻辑连接。见《06TCP通信过程.png》
    	优点:TCP协议提供了两台计算机之间可靠无差错的数据传输，通常用于上传、下载、网页浏览等操作。
    	缺点:由于TCP的面向连接，消耗的资源要多一些，传输效率低。
    2.特点
    	面向连接的协议
    	客户端通过三次握手建立连接后，开始数据交互
    	基于IO流形式传输数据
    	传输数据大小无限制
    	速度慢，数据安全可靠
    	通过四次挥手断开连接
    3.使用场景
    	文件上传和下载、邮件发送和接收、远程登录

TCP协议编程
     1.客户端套接字
    	Socket 一个该类的对象就代表一个客户端程序。
    	构造方法
     		public  Socket(String host, int port)根据ip地址字符串和端口号创建客户端Socket对象
     		调用该构造方法创建对象，会连接指定的服务器程序，如果不成功，抛出异常。如果成功，则表示三次握手通过。
    	常用方法
     		OutputStream getOutputStream(); 获得字节输出流对象
            InputStream getInputStream();获得字节输入流对象
    2.服务端套接字
    	ServerSocket  一个该类的对象就代表一个服务器端程序。
    	构造方法
     		public  ServerSocket(int port)：根据端口创建服务端ServerSocket对象。
    	常用方法
     		Socket accept():获得服务端Socket对象

需求:使用TCP完成客户端和服务器互相发送一句话
 */
public class Test_03TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象

        //创建连接，获取连接对象

        //获取输入流，读取客户端数据

        //获取输出流，反馈数据给客户端

        //关闭资源

        //关闭服务器，一般不关
        //serverSocket.close();
    }
}
