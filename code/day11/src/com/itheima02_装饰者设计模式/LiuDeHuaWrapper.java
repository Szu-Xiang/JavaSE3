package com.itheima02_装饰者设计模式;

//刘德华装饰类

public class LiuDeHuaWrapper implements Star{
    private LiuDeHua ldh;

    public LiuDeHuaWrapper(LiuDeHua ldh) {
        this.ldh = ldh;
    }

    @Override
    public void sing() {
        ldh.sing();
        System.out.println("换我一句不流泪");
        ldh.dance();
    }

    @Override
    public void dance() {
        //不用增强
        ldh.dance();
    }
}
