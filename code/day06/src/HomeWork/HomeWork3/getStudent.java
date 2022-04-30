package HomeWork.HomeWork3;

import java.util.HashSet;

public class getStudent {
    public static void main(String[] args) {
        HashSet<studentInfo> hs = new HashSet<>();

        studentInfo s1 = new studentInfo("张三","男",20);
        studentInfo s2 = new studentInfo("李四","女",21);
        studentInfo s3 = new studentInfo("张三","男",20);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (studentInfo h : hs) {
            //若要实现去重操作，需先在学生类中重写equals方法
            System.out.println(h);
        }

    }
}
