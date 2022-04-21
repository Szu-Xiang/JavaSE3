package Util;

/*
    工具类,各种实现方法，具体如下：
    showPerson():用于展示操作后的学生信息            findIndex()：查询学号，无学号返回-1

    birthdayToAge():将生日信息转换成年龄            showAllStudent():展示所有学生信息

 */
import bean.Person;
import bean.Student;

import java.util.*;
import java.text.*;

public class Util {

    public static int sid = 0;
    public static int tid = 0;

    public static void showPerson(Person p) {
        System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getGender() +
                "\t" + p.getBirthday() + "\t" + p.getAge() + p.describe());
    }

    public static int findIndex(ArrayList<Student> array, String id) {

        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if(s.getId().equals(id)) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int birthdayToAge(String birthday) {

        int age = -1;

        //String -> Date -> Calendar
        Calendar birCal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birDate = null;
        try {
            birDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        birCal.setTime(birDate);
        Calendar nowCal = Calendar.getInstance();

        if(birCal.before(nowCal)) {
            int nowYear = nowCal.get(Calendar.YEAR);
            int birYear = birCal.get(Calendar.YEAR);
            int nowMonth = nowCal.get(Calendar.MONTH);
            int birMonth = birCal.get(Calendar.MONTH);
            int nowDay = nowCal.get(Calendar.DAY_OF_MONTH);
            int birDay = birCal.get(Calendar.DAY_OF_MONTH);

            age = nowYear - birYear;

            if(nowMonth < birMonth || (nowMonth == birMonth) && (nowDay < birDay)) {
                age --;
            }
        }

        return age;
    }
}
