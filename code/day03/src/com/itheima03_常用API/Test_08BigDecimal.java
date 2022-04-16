package com.itheima03_常用API;

/*
1.概述:
    java.math.BigDecimal  为浮点数提供精准计算的类
    小数转换成二进制存储到计算机中，在参与运算的过程中会出现丢失精度的现象。
2.构造方法:
    BigDecimal(double val)  将double类型的数据封装为BigDecimal对象(不推荐使用).
    BigDecimal(String val)  将 BigDecimal 的字符串表示形式转换为 BigDecimal
3.常用方法:
    加法运算	public BigDecimal add(BigDecimal value)
    减法运算	public BigDecimal subtract(BigDecimal value)
    乘法运算	public BigDecimal multiply(BigDecimal value)
    除法运算
    	public BigDecimal divide(BigDecimal value)  不推荐
    	public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
     		divisor：除数对应的BigDecimal对象；
     		scale:精确的位数；
     		roundingMode取舍模式  枚举类型，示例： RoundingMode.HALF_UP 四舍五入
需求:演示BigDecimal类的构造方法与常用方法

 */
public class Test_08BigDecimal {
    public static void main(String[] args) {
        //浮点数由指数和尾数组成，目的是增大数值范围，问题是容易丢失精确度，导致运算误差。
        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);
    }
}
