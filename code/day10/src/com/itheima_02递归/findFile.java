package com.itheima_02递归;

import java.io.File;

public class findFile {
    public static void main(String[] args) {
        File f = new File("/Users/gouhaoxiang/JavaSE2/code/day08");
        findJava(f);
    }

    public static void findJava(File f) {
        if (f.length() == 0) {
            return;
        }

        //如果文件不为空且为目录
        if (f.isDirectory()) {
            File[] files = f.listFiles();

            //遍历所有目录
            for (File file : files) {
                //判断是否仍为目录，若为目录，则递归调用findJava方法
                if (file.isDirectory()) {
                    findJava(file);
                } else if (file.getName().endsWith(".java") && file.isFile()){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }

    }
}

