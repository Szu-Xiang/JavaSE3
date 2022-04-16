package com.itheima03_正则表达式;

import java.util.Scanner;

/*
概述
    在Java中，有时需求:对字符串进行一些格式上的验证, 如果使用多层if语句判断会非常复杂且。
    正则表达式内部描述了用来验证各种字符串的规则，用来验证指定的字符串是否匹配某个规则。
    例如：年龄必须是2位的数字、用户名必须是8位长度而且只能包含大小写字母、数字等。
需求:分别使用if语句和正在表达式，对用户输入一个QQ号码做验证操作。要求同时符合一下三个规则才算通过验证。
    规则1:QQ号码必须是5--15位长度
    规则2:而且首位不能为0
    规则3:而且必须全部是数字
 */
public class Test_01正则入门 {
    public static void main(String[] args) {
        String qq="595634132";

    }

    //普通方式验证
    public static boolean checkQQ(String qq) {
        if (qq.length() < 5 || qq.length() > 15)
            return false;
        if (qq.charAt(0) == '0')
            return false;
        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9')
                return false;
        }

        return true;
    }
}
