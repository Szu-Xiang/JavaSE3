package com.吃包子案例;

public class Test {
    public static void main(String[] args) {

        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建吃货线程并启动
        new ChiHuoThread(bz,"小鹿").start();
        //创建包子铺线程并启动
        new BaoZiPu(bz,"包子铺").start();
    }
}
