package com.itheima01_网络编程;

import java.net.*;

/*
UDP协议概述
    1.概述
    	UDP(User Datagram Protocol)是无连接通信协议，数据发送前，发送端和接收端不建立逻辑连接。见《05UDP通信过程.png》
    	优点:UDP协议消耗资源小，通信效率高，通常用于音频、视频和普通数据的传输例。
    	缺点:由于UDP的面向无连接，不能保证数据传输的完整性，在传输重要数据时不建议使用UDP协议。
    2.特点
    	面向无连接
    	发送端只管发送，不确认对方是否能收到。
    	基于数据包形式传输数据
    	每次发送的数据包限制64K以内
    	速度快，不可靠。
    3.使用场景
    	即时通讯、在线视频、网络语音电话

UDP协议编程
    1.数据包类
    	DatagramPacket  数据包对象，用来封装要发送或要接收的数据
    	构造方法
     		DatagramPacket(byte[] buf, int length, InetAddress address, int port):创建发送端数据包对象
     		DatagramPacket(byte[] buf, int length)：创建接收端数据包对象
    	常用方法
     		int getLength() 获得实际接收到的字节个数
     		InetAddress getAddress() 获取ip地址对象
    2.套接字类
    	DatagramSocket  套接字类，用来发送或接收数据包
    	构造方法
     		DatagramSocket() 创建发送端的Socket对象，系统会随机分配一个端口号。
     		DatagramSocket(int port) 创建接收端的Socket对象并指定端口号
    	常用方法
     		void send(DatagramPacket dp) 发送数据包
     		void receive(DatagramPacket p) 接收数据包

 */
//发送端
public class Test_02UDPSend {
    public static void main(String[] args) throws Exception {
        //创建数据包(准备数据)

        //发送数据

        //关闭资源

    }
}
