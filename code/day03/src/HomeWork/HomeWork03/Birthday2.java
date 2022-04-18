package HomeWork.HomeWork03;

/*
    需求：请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，程序要能够计算并打印：第一个生日大于/小于第二个生日。
	注意：要求验证生日日期必须早于当前日期

 */

import java.util.*;
import java.text.*;
public class Birthday2 {
    public static void main(String[] args) throws ParseException {

        System.out.println("请输入两个生日: (格式为：yyyy-MM-dd) " );
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        //创建SimpleDateFormat对象，规定好日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");

        Date birthday1 = sdf.parse(s1);
        Date birthday2 = sdf.parse(s2);
        Date now = new Date();

        if(birthday1.after(now) || birthday2.after(now)) {
            System.out.println("输入不规范，请输入当前日期之前的日期");
        } else if(birthday1.after(birthday2)) {
            System.out.println("第一个生日小于第二个生日");
        } else {
            System.out.println("第一个生日大于第二个生日");
        }


    }
}
