package com.itheima01_Generic;

public class GenericInterImpl<BYD> implements GenericInter<BYD> {

    @Override
    public void method1(BYD byd) {
        System.out.println(byd);
    }

}
