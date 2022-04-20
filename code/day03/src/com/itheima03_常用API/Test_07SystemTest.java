package com.itheima03_常用API;

/*
需求:在控制台输出100000次内容，计算这段代码执行了多少毫秒
步骤:
    获取开始时间
    干活
    获取结束时间
    结束时间-开始时间
 */

public class Test_07SystemTest {
    public static void main(String[] args) {
        //开始时间
        long startTime = System.currentTimeMillis();

        doSomeThing();

        //结束时间
        long endTime = System.currentTimeMillis();
        //使用时间
        long useTime = endTime - startTime;

        //输出使用的时间
        System.out.println("共使用了" + useTime + "毫秒");
        //1年=365天   1天24小时  1小时=60分  1分=60秒   1秒=1000毫秒
        System.out.println("共使用了" + 1.0 * useTime / 1000 + "秒");
        System.out.println("共使用了" + 1.0 * useTime / (1000 * 60) + "分钟");
    }

    public static void doSomeThing() {
        //做事情  数字.fori
        for (int i = 0; i < 100000; i++) {
            System.out.println("第" + (i + 1) + "次打印内容");
        }
    }
}

