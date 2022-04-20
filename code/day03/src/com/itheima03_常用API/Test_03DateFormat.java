package com.itheima03_常用API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    public static void main(String[] args) throws ParseException {

        //Date --> String 格式化用format
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String result1 = sdf1.format(d);
        System.out.println(result1);

        //String --> Date 解析用parse
        String time = "2022年2月24日 10:10:10";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date result2 = sdf1.parse(time);
        System.out.println(result2);


//        try {
//            Date result2 = sdf.parse(time);
//            System.out.println(result2);
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }





    }
}


