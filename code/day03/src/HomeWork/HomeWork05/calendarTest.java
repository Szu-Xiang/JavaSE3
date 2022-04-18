package HomeWork.HomeWork05;

/*
    需求：请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
 */
import java.util.Calendar;

public class calendarTest {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        showCalendar(c);
    }

    public static void showCalendar(Calendar c) {

       int year = c.get(Calendar.YEAR);
       int month = c.get(Calendar.MONTH);
       int day = c.get(Calendar.DAY_OF_MONTH);
       int hour = c.get(Calendar.HOUR_OF_DAY);
       int minute = c.get(Calendar.MINUTE);
       int second = c.get(Calendar.SECOND);
       month++;


        System.out.println(year + "年" + month + "月" + day + "日 " + hour + "时" + minute + "分" + second + "秒");
    }


}
