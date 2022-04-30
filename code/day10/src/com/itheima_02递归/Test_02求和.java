package com.itheima_02递归;

/*
1.需求:
	计算1+2+3+...+n的和。
2.分析
	1~1的和=1
	1~2的和=(1~1)的和+2
	1~3的和=(1~2)的和+3
	综上分析:规则-->1~n的和等于1~(n-1)+n；出口-->n等于1的时候，值为1。
 */
 public  class Test_02求和 {
    public static void main(String[] args) {
        int result = sum(4);
        System.out.println(result);
    }
    public static int sum(int a) {
        if(a == 1) {
            return a;
        } else {
            return a + sum(a - 1);
        }

    }
}
