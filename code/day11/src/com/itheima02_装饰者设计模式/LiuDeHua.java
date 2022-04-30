package com.itheima02_装饰者设计模式;

public class LiuDeHua implements Star{
    @Override
    public void sing() {
        System.out.println("啊～啊～给我一杯忘情水");
    }

    @Override
    public void dance() {
        System.out.println("跳舞");
    }
}
