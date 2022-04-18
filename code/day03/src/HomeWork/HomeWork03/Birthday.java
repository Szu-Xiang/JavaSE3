package HomeWork.HomeWork03;

/*
    需求：请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
	     注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！

 */

import java.text.*;
import java.util.*;


public class Birthday {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //判断日期
        Date birthday = sdf.parse(s);
        Date now = new Date();

        if(birthday.after(now)) {
            System.out.println("生日必须早于当前日期！");
            return;
        }

        long millisecond = now.getTime() - birthday.getTime();
        long days = millisecond / 1000 / 60 / 60 / 24;
        System.out.println("来到这个世界" + days + "天");

    }
}
