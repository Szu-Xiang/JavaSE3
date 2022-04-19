package entry;

import bean.Student;
import utils.Util;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    //将集合放到成员位置，整个类中都可以使用，定义的方法，可以不提供参数。
    //设置成static才可以被访问到
    static ArrayList<Student> array = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.学生管理系统  2.教师管理系统  3.退出");
            System.out.println("请输入您的选择...");

            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();

            switch (choose) {
                case "1":
                    //有一个方法，负责学生管理系统
                    studentManager();
                    break;
                case "2":
                    System.out.println("进入教师管理系统");
                    System.out.println("结束教师管理系统");
                    break;
                case "3":
                    System.out.println("退出，下次再见");
                    //结束程序
                    return;

                default:
                    System.out.println("您输入的选项有误");
            }
        }
    }

    //学生管理系统
    public static void studentManager() {
        while (true) {
            System.out.println("---------------");
            System.out.println("1.添加学员 2.修改学员 3.删除学员 4.查询学员 5.返回");
            System.out.println("请输入功能的序号：");
            Scanner sc = new Scanner(System.in);

            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    addAllStudent();
                    break;
                case "2":
                    updateStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("返回到主界面");
                    System.out.println();
                    return;
                default:
                    System.out.println("您输入的选项有误");

            }
        }
    }

    /**
     * 更新集合中学生信息方法
     */
    public static void updateStudent() {
        System.out.println("请输入要修改的学生ID");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        int index = Util.findIndex(array,sid);

        if(index == -1) {
            System.out.println("【错误】 学员ID：" + sid + " 未找到，请检查");
        } else {
            System.out.println("【查询结果】 要修改的学员信息");
            Student s = array.get(index);
            Util.showPerson(s);

            //录入新的学生信息
            System.out.println("请输入姓名");
            String name = sc.nextLine();
            System.out.println("请输入性别");
            String gender = sc.nextLine();
            System.out.println("请输入生日");
            String birthday = sc.nextLine();

            //获取新的年龄
            int age = Util.birthdayToAge(birthday);
            //用新的信息替换旧的信息
            //方式1：
            //根据新的信息去获取新的学生对象
//            Student newStu = new Student(sid, name,birthday, age,gender);
//            array.set(index,newStu);
            //方式2
            //获取要修改的学员对象
            s.setName(name);
            s.setAge(age);
            s.setBirthday(birthday);
            s.setGender(gender);
            System.out.println("【成功】 学员信息已更新");
        }
    }

    /**
     *删除学生方法
     */

    public static void deleteStudent() {
        System.out.println("请输入要删除的ID");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();

        //判断学号是否存在
        //获取学号对应的学员在集合中的位置
        //根据得到的位置去判断该学号是否存在，不存在返回-1
        int index = Util.findIndex(array,sid);
        if(index == -1) {
            System.out.println("【错误】 学员ID：" + sid + "未找到，请检查");
        } else {
            System.out.println("【查询结果】 要删除的学员信息");
            Student s = array.get(index);
            Util.showPerson(s);

            while (true) {
                System.out.println("【确认】 您要删除这条信息吗？（y/n）？");
                String choose = sc.nextLine();
                if (choose.equals("n")) {
                    System.out.println("【取消】 操作被取消");
                    break;
                } else if(choose.equals("y")) {
                    array.remove(index);
                    System.out.println("【成功】 数据已被删除");
                    break;
                } else {
                    System.out.println("您的输入有误，请检查");
                }
            }
        }

    }

    /**
     * 该方法用于添加学生数据
     */
    public static void addAllStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学员信息");
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入性别");
        String gender = sc.nextLine();
        System.out.println("请输入生日 (格式：2020-12-12");
        String birthday = sc.nextLine();

        String sid = Util.sid + "";
        int age = Util.birthdayToAge(birthday);
        Student s = new Student(sid,name,birthday,age,gender);
        array.add(s);
        System.out.println("【成功】 学员信息添加成功");
        Util.sid++;
    }

    /**
     * 该方法用于查询集合中所有的学生数据
     */
    public static void findAllStudent() {

        //判断是否有数据
        if(array == null || array.size() == 0) {
            System.out.println("无数据");
            return;
        }
        System.out.println("【查询结果】");
        Util.showAllStudent(array);

    }
}
