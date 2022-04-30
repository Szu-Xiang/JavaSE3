package HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/gouhaoxiang/JavaSE2/code/day10/test1.txt");
        FileOutputStream fos = new FileOutputStream("/Users/gouhaoxiang/JavaSE2/code/day10/test2.txt");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }
}
