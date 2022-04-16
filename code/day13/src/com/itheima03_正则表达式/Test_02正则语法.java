package com.itheima03_正则表达式;

/*
正则表达式
 */
public class Test_02正则语法 {
    public static void main(String[] args) {
        method1();
        //method2();
        //method3();
        //method4();
        //method5();
    }

    /*
    字符类语法
        1. [abc]：代表a或者b，或者c字符中的一个。
        2. [^abc]：代表除a,b,c以外的任何字符。
        3. [a-z]：代表a-z的所有小写字符中的一个。
        4. [A-Z]：代表A-Z的所有大写字符中的一个。
        5. [0-9]：代表0-9之间的某一个数字字符。
        6. [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
        7. [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符。
     */
    public static void method1() {
        String str = "ead";
        String regex = "";

        //1. 验证str是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符

        //2. 验证str是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符

        //3. 验证str是否a-z的任何一个小写字符开头，后跟ad

        //4. 验证str是否以a-d或者m-p之间某个字符开头，后跟ad

    }

    /*
    逻辑运算符语法
        1. &&：并且
        2. | ：或者。
     */
    public static void method2() {
        String str = "had";
        String regex = "";

        //1. 验证字符串是小写辅音(非a,e,i,o,u)字符开头，后跟ad。

        //2. 验证字符串是aeiou中的某个字符开头，后跟ad。

    }

    /*
    预定义字符语法
        1. "." ： 匹配任何字符。如果要表示一个字符点,那么就得使用\\.
        2. "\d"：任何数字[0-9]的简写；
        3. "\D"：任何非数字\[^0-9\]的简写；
        4. "\s"： 空白字符：[ \t\n\x0B\f\r] 的简写
        5. "\S"： 非空白字符：\[^\s\] 的简写
        6. "\w"：单词字符：[a-zA-Z_0-9]的简写
        7. "\W"：非单词字符：\[^\w\]
     */
    public static void method3() {
        String str = "";
        String regex = "";

        //1. 验证str是否3位数字
        str = "258";

        //2. 验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
        str = "13513153355";

        //3. 验证字符串是否以h开头，以d结尾，中间是任何字符
        str = "had";

        //4. 验证str是否是：had.。.代表'.'符号，因为.在正则中被预定义为"任意字符"，不能直接使用
        str = "had.";

    }

    /*
    数量词语法
        1. X? : 0次或1次
        2. X* : 0次到多次
        3. X+ : 1次或多次
        4. X{n} : 恰好n次
        5. X{n,} : 至少n次
        6. X{n,m}: n到m次(n和m都是包含的)。
     */
    public static void method4() {
        String str = "";
        String regex = "";

        //1. 验证str是否是三位数字
        str = "012";

        //2. 验证str是否是多位数字
        str = "88932054782342";

        //3. 验证str是否是手机号
        str = "13813183388";
    }

    /*
    分组语法
        ():将一系列操作作为一个整体来理解。
     */
    public static void method5() {
        String str = "";
        String regex = "";

        //1.使用正则表达式，完成"DG8FV-B9TKY-FRT9J-99899-XPQ4G"序列号字符串内容的验证
        str = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";

        //2. 验证小数：要求匹配：3、3.0、3.14、+3.14、-3.0
        str = "-0.3";

    }
}
