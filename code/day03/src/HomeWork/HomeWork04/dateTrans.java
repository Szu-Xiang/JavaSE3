package HomeWork.HomeWork04;
/*

 */
import java.text.*;
import java.util.*;

public class dateTrans {

    public static void main(String[] args) throws ParseException {
        System.out.println("输入一个日期：");
        Scanner sc = new Scanner(System.in);

        String d = sc.nextLine();

        //设置格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(d);

        //将日期转换为特定格式的字符串 format
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);

        System.out.println(result);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        String result1 = sdf3.format(new Date());
        System.out.println(result1);
    }
}
