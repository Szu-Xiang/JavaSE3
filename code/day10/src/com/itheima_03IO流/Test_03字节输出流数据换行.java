package com.itheima_03IO流;

import java.io.FileOutputStream;
import java.io.IOException;

/*
1.概述
	在指定数据之后换行，可以按照指定操作让写入的内容后面换行。
2.换行操作
	\r：回车符，回到一行的开头(return)。
	\n：换行符，新的一行(newLine)
	不同系统中的换行：
      		Windows系统里，每行结尾是 回车+换行 ，即\r\n；
      		Unix系统里，每行结尾只有换行 ，即\n；
      		Mac系统里，每行结尾是 回车 ，即\r。从 Mac OS X开始与Linux统一。
需求:将abcde中每个字符单独写一行
 */
 public  class Test_03字节输出流数据换行 {
    public static void main(String[] args) throws IOException {
        //Windows系统里，每行结尾是 回车+换行 ，即\r\n；
        //Unix系统里，每行结尾只有换行 ，即\n；
        //Mac系统里，每行结尾是 回车 ，即\r。从 Mac OS X开始与Linux统一。
        FileOutputStream fos = new FileOutputStream("code/day10/resource/demo1/a.txt");

        fos.write(97);

        //输出换行
        byte[] bys = "\r".getBytes();
        fos.write(bys);
        fos.write(98);
        fos.close();

    }
}
