package com.itheima_02递归;

import java.io.File;

/*
1.需求:
	使用递归搜索指定目录及其子目录中的所有.java 文件。
2.分析
	1.判断指定的路径如果为空或不是目录，结束操作。
	2.若不为空且是目录，则获取目录下所有的File数组对象。提示:listFiles
	3.遍历File数组获取到的所有File对象，判断File是否是指定文件。
 		判断如果是文件，且是指定格式的文件，打印该文件名
 		判断如果是目录,回到步骤1
	综上:规则-->遍历目录中的文件,是目录则递归，是文件则打印；出口-->是文件不再递归调用。
*/
public class Test_04搜索文件 {
    public static void main(String[] args) {
        File f = new File("day10");
    }

}
