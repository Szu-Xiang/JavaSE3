package HomeWork;

import java.io.File;

public class HomeWork6 {
    public static void main(String[] args) {
        File file = new File("/Users/gouhaoxiang/JavaSE2/code/day10/multiDic");
        getFile(file);
    }

    public static void getFile(File f) {
        File[] files = null;
        if (f.isDirectory() && f != null) {
            files = f.listFiles();
        } else {
            return ;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                getFile(file);
            } else if (file.isFile() && file.getName().endsWith(".txt")){
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
