package com.itheima01_IO异常处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
1.概述
	实际开发中try...catch...finally 代码块，处理IO中的异常部分，其中finally用来确保关闭资源。
	finally关闭资源不会立即关闭，取决于网络和系统，可能很快，也可能等一两天，所以不建议finally作为业务流程的控制。
	在JDK1.7提供了try-with-resource语句，该语句确保了资源(对象)在语句结束时关闭。
	只有实现了AutoCloseable接口的类才可以使用该操作。
2.格式
	try (数据类型 变量名1=对象1;数据类型 变量名2 = 对象2;...) {
    		// 操作
		} catch (IOException e) {
    		...
	}
需求:通过字符输出流演示try-with-resource语句
*/
public class Test_01jdk7版异常处理 {
    public static void main(String[] args) {
        //try-catch-finally处理异常

        //try-with-resource

    }

}
