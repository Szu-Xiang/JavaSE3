package com.itheima_02递归;

/*
1.需求:
	计算1*2*3*...*n的积。
2.分析
	1~1的积=1
	1~2的积=(1~1)的积*2
	1~3的积=(1~2)的积*3
	综上分析:规则-->1~n的积等于1~(n-1)*n；出口-->n等于1的时候，值为1

 */
 public  class Test_03求阶乘 {
    public static void main(String[] args) {
        int result = multi(5);
        System.out.println(result);
    }
    public static int multi(int a) {
        if(a == 1) {
            return 1;
        } else {
            return a * multi(a - 1);
        }
    }
}
