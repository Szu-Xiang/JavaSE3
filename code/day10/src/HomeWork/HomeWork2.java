package HomeWork;
/*
    请编写main()方法，创建以下File对象：
		File file1 = new File(“test.txt”);//相对路径，在项目根目录下
		File file2 = new File(“一级目录”);
		File file3 = new File(“目录A/目录B/目录C”);
	要求：
		1. 判断file1是否存在？如果不存在，创建这个文件。
		2. 判断file2是否存在？如果不存在，创建这个目录。
		3. 判断file3是否存在？如果不存在，创建这个多级目录。

 */
import java.io.File;
import java.io.IOException;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("/Users/gouhaoxiang/JavaSE2/code/day10/test2.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        } else {
            System.out.println(file1.getAbsolutePath() + " 已经存在");
        }

        File file2 = new File("一级目录");
        if (!file2.exists()) {
            file2.mkdir();
        } else {
            System.out.println(file2.getAbsolutePath() + " 已经存在");
        }

        File file3 = new File("目录A/目录B/目录C");
        if (!file3.exists()) {
           file3.mkdirs();
        } else {
            System.out.println(file3.getAbsolutePath() + " 已经存在");
        }


    }
}
