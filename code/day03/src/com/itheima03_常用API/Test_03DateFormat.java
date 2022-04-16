package com.itheima03_常用API;

/*
1.概述:
    java.text.DateFormat 该类可以使得在Date对象与String对象之间进行来回转换.
2.构造方法:
    DateFormat为抽象类，需要使用其子类java.text.SimpleDateFormat创建对象。
    public SimpleDateFormat(String pattern)：用给定模式和默认语言环境日期格式符号构造参数
        pattern是一个字符串，代表时间在转换过程中遵守的格式。
        格式定义规则:y--年   M--月  d--日  H--时  m--分   s--秒
        格式范例:yyyyMMdd HH:mm:ss  或者  yyyy年MM月dd日 HH:mm:ss .... 或者yyyyMMdd
3.常见功能:
    public String format(Date date)：(格式化)按照指定的格式，把Date对象转换为String对象。
    public Date parse(String source)：(解析)按照指定的格式，把String对象转换为Date对象。
*/
public class Test_03DateFormat {
    public static void main(String[] args) {

    }
}
