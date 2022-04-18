package HomeWork.HomeWork06;

/*
    需求：国庆大典当天是星期几？
 */
import java.util.Calendar;

public class birthdayofHomeland {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //设置日期，月份要-1
        c.set(1949,9,1);

        String[] weeks = {"星期天", "星期一","星期二", "星期三", "星期四", "星期五", "星期六" };

        int week = c.get(Calendar.DAY_OF_WEEK);
        week--;
        System.out.println(weeks[week]);
    }
}
