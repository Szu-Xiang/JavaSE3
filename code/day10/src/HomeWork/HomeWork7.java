package HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork7 {
    public static void main(String[] args) throws IOException {
        //请使用字节流复制一个文件，一次读、写一个字节。

        //输入流
        FileInputStream fis = new FileInputStream("/Users/gouhaoxiang/JavaSE2/code/day10/test1.txt");

        //输出流
        FileOutputStream fos = new FileOutputStream("/Users/gouhaoxiang/JavaSE2/code/day10/test2.txt");

        //按字节循环读写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
