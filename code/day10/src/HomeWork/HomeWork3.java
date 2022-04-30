package HomeWork;

import java.io.File;
import java.io.IOException;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/gouhaoxiang/JavaSE2/code/day10/multiDic");
        file.mkdir();

        //将文件列出
        File[] files = file.listFiles();
        //遍历
        for (File file1 : files) {
            //若为目录
            if (file1.isDirectory()) {
                System.out.println("【目录】:" + file1.getAbsolutePath());
                //遍历目录
                File[] files1 = file1.listFiles();
                for (File file2 : files1) {
                    //若目录中有文件则输出
                    if (file2.isFile()) {
                        System.out.println("【文件】:" + file2.getAbsolutePath());
                    }
                }
                //若根目录下有独立的文件，则打印路径
            } else if (file1.isFile()) {
                System.out.println("【文件】:" + file1.getAbsolutePath());
            }
        }


    }

}
