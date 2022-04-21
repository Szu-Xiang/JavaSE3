package HomeWork.HomeWork12;

import java.util.Scanner;

public class package2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();

        System.out.println("请输入年龄：");
        String ageStr = sc.nextLine();

        System.out.println("请输入身高(例如：1.88)：");
        String heightStr = sc.nextLine();

        System.out.println("请输入婚否(true or false)：");
        String marriageStr = sc.nextLine();

        System.out.println("请输入性别：");
        String genderStr = sc.nextLine();

        int age = Integer.parseInt(ageStr);
        double height = Double.parseDouble(heightStr);
        boolean marriage = Boolean.parseBoolean(marriageStr);
        char gender = genderStr.charAt(0);

        Student s = new Student(name, age, height, marriage, gender);
        s.show();

    }
}
