package utils;

import bean.Person;
import bean.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Util {

    //学生ID
    public static int sid = 0;
    //老师ID
    public static int tid = 0;

    /**
     * 该方法用于打印所有单个对象
     *
     * @param p 要打印的对象
     */
    public static void showPerson(Person p) {
        System.out.println("***************************");
        System.out.println("编号\t姓名\t性别\t生日\t\t\t年龄\t描述");

        System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getGender() + "\t"
                + p.getBirthday() + "\t" + p.getAge() + "\t" + p.describe());

        System.out.println("******************************************");

    }

    public static void showAllStudent(ArrayList<Student> array) {
        System.out.println("******************************************");
        System.out.println("编号\t姓名\t性别\t生日\t\t\t年龄\t描述");

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getGender()
                    + "\t" + s.getBirthday() + "\t" + s.getAge() + "\t" + s.describe());
        }
    }

    /**
     * 该方法用于将 生日 转换成对应的 年龄
     *
     * @param birthday 当前的生日
     * @return 返回当前生日对应的年龄
     */

    public static int birthdayToAge(String birthday) {
        int age = -1;

        //String->Date->Calendar
        Calendar birCal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date birDate = null;
        try {
            //String -> Date 类型转换
            birDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Date -> Calendar  将Date类型的生日转换为Calendar类型
        assert birDate != null;
        birCal.setTime(birDate);

        Calendar nowCal = Calendar.getInstance();

        if (birCal.before(nowCal)) {

            int nowYear = nowCal.get(Calendar.YEAR);
            int birYear = birCal.get(Calendar.YEAR);
            int birMonth = birCal.get(Calendar.MONTH);
            int nowMonth = nowCal.get(Calendar.MONTH);
            int birDay = birCal.get(Calendar.DAY_OF_MONTH);
            int nowDay = nowCal.get(Calendar.DAY_OF_MONTH);

            age = nowYear - birYear;

            //（如果当前的月 < 生日的月, 或者月相等，但是日期比当前日期早，则减一岁
            if (nowMonth < birMonth || (nowMonth == birMonth) && (nowDay < birDay)) {
                age--;
            }
        }
        return age;
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




}


