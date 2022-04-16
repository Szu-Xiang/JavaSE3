package com.itheima01_static.p02开发中的应用;

/**
 * @author  Harrison
 * @version 1.0
 */

public class Util {

    //为了避免别人创建对象，当前类是工具类，无必要创建对象使用
    private Util() {

    }

    //防止用户更改共享的静态变量，用final修饰，变量用大写
    public final static double PI = 3.14;

    /**
     * 该方法用于获取数组中的最大值
     * @param arr 求最大值的数组
     * @return 返回最大值
     */

    public static int getMax(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
