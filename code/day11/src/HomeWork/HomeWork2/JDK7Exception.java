package HomeWork.HomeWork2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JDK7Exception {
    public static void main(String[] args) throws IOException {
        try {
            Writer writer = new FileWriter("/Users/gouhaoxiang/JavaSE2/code/day11/resource/student.txt");
        } catch (IOException e) {
            System.out.println("程序出现异常，异常信息：" + e.getMessage());
        }


    }
}
