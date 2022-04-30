package HomeWork;

import java.io.File;

public class HomeWork1 {
    public static void main(String[] args) {
        File file1 = new File("/Users/gouhaoxiang/JavaSE2/code/day10/test1.txt");
        File file2 = new File("/Users/gouhaoxiang/JavaSE2/code/day10/TestDic");

        //1. 获取、打印file1和file2的绝对路径；
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());

        //2. 获取、打印file1和file2的文件名和目录名；
        System.out.println(file1.getName());
        System.out.println("file1的目录为：" + file1.getParent());
        System.out.println(file2.getName());
        System.out.println("file2的目录为：" + file2.getParent());

        //3. 获取、打印file1和file2的文件大小；
        System.out.println(file1.length());
        System.out.println(file2.length());

        //4. 分别判断file1和file2是否存在；
        System.out.println(file1.exists());
        System.out.println(file2.exists());

        //5. 分别判断file1和file2是否是文件？是否是目录
        System.out.println("file1是文件吗？ " + file1.isFile());
        System.out.println("file1是目录吗？ " + file1.isDirectory());

        System.out.println("file2是文件吗？ " + file2.isFile());
        System.out.println("file2是目录吗？ " + file2.isDirectory());
    }
}
