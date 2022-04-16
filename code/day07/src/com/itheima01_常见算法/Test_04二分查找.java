package com.itheima01_常见算法;

/*
1.概述
	二分查找也称折半查找（Binary Search），它是一种效率较高的查找方法。
	但是，折半查找要求线性表必须采用顺序存储结构，而且表中元素按关键字有序排列。
2.原理
	找到首位置和末位置，根据这两个位置获取中间位置(首位置要小于末位置)；
	利用中间位置获取中间元素，与要查找的元素作比较。
	若查找元素比中间元素大(首位置=中间位置+1)，若查找元素比中间元素小(末位置=中间位置-1)，重复上面步骤
	若查找元素等于中间元素，即为找到，结束查找过程。

需求:将{1, 4, 16, 22, 25, 44, 55, 67, 88, 100}存入数组，并查找制定数值的位置

 */
public class Test_04二分查找 {
    public static void main(String[] args) {

    }
}
