package HomeWork.HomeWork02;

public class Test {

    public static void main(String[] args) {

        Student s1 = new Student("小黄", "女", 24);
        Student s2 = new Student("小黄" ,"女",24);
        Student s3 = new Student("小蓝" ,"未知",24);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    }
}
