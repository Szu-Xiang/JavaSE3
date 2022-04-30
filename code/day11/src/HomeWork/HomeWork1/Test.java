package HomeWork.HomeWork1;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();

        stuList.add(new Student("张三", "男",20,88));
        stuList.add(new Student("李四", "女",19,98));

        FileWriter writer = new FileWriter("/Users/gouhaoxiang/JavaSE2/code/day11/resource/student.txt");
        for (Student student : stuList) {
            writer.write(student.getName() + "," + student.getGender() + ","
                    +student.getAge() + "," + student.getScore());
            writer.write("\n");
        }

        writer.close();

        FileReader reader = new FileReader("/Users/gouhaoxiang/JavaSE2/code/day11/resource/student.txt");
        int c = -1;
        while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }

        reader.close();
    }
}
