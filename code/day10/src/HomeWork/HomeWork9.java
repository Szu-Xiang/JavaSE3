package HomeWork;

/*
1.需求:
	将已存在的图片，从一个目录中，复制到另一个目录中。
2.分析
	文件的复制本质就是将读取到的内容，写入到另一个路径。《图片复制案例分析.png》
	使用字节输入流指向要读取的文件。
	使用字节输出流指向要写入的位置。
	将字节输入流读取到的数据通过字节输出流写入指定位置。
	由于读取的操作需要重复进行，需要通过循环改进，又循环的次数不明确，故用while循环改进，循环的条件为有数据读取到。

 */

import java.io.*;

public class HomeWork9 {
    public static void main(String[] args) throws IOException {
        //源路径
        File ResourceFile = new File("/Users/gouhaoxiang/JavaSE2/code/day10/resource/image.jpg");
        //输入流
        FileInputStream fis = new FileInputStream(ResourceFile);

        //目的路径
        File DesFile = new File("/Users/gouhaoxiang/JavaSE2/code/day10/resource/demo1/image2.jpg");
        //输出流
        FileOutputStream fos = new FileOutputStream(DesFile);

        int len = -1;
        byte[] bytes = new byte[1024];

        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();

    }
}
