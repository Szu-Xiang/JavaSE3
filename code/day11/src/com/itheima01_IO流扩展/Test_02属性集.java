package com.itheima01_IO流扩展;

import java.io.IOException;

/*
基本使用
    1.概述
    	java.util.Properties 继承于Hashtable，表示一个持久的属性集。
    	它使用键值结构存储数据，每个键及其对应值都是一个字符串。
    	该类被许多Java类使用，比如获取系统属性时，System.getProperties()就是返回Properties对象。。
    2.构造方法
    	public Properties() :创建一个空的属性列表
    3.常用方法
    	public Object setProperty(String key, String value): 保存一对属性。
    	public String getProperty(String key) :使用此属性列表中指定的键搜索属性值。
    	public Set<String> stringPropertyNames() :所有键的名称的集合。
IO流相关操作
    1.概述
    	通过流对象，可以关联到某文件上，针对键值对在属性集与文本之间做存取键值对数据的操作。
    	存储或读取的文本内容格式：键=值(每行一对数据)。
    2.常用方法
    	public void load(InputStream inStream)： 从字节输入流中读取键值对。
    	public void load(Reader reader):从字符输入流中读取键值对。
    	public void store(OutputStream out,String comments)：用字节输出流写出键值对
    	public void store(Writer writer,String comments):用字符输出流写出键值对。
  */
 public  class Test_02属性集 {
    public static void main(String[] args) throws IOException {

    }
}
