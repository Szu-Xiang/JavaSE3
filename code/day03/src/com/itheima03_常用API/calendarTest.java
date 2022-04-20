package com.itheima03_常用API;

import java.util.Calendar;
import java.util.Scanner;

/*
    需求：查询某一年的2月有多少天

    思路：键盘录入一个年份，按照概念设置日历到3月1日，往前推一天即为2月的最后一天，输出即可
 */
public class calendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //往前推一天
        c.add(Calendar.DATE, -1);
        //获取并输出
        int days = c.get(Calendar.DATE);

        System.out.println(days);
    }
}
