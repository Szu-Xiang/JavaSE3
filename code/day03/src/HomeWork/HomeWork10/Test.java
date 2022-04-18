package HomeWork.HomeWork10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {

        Student stu1 = new Student("张三", "男", 20,79.5);
        Student stu2 = new Student("李四", "女", 20,80.2);
        Student stu3 = new Student("王五", "女", 20,77.9);
        Student stu4 = new Student("赵六", "男", 20,55.8);
        Student stu5 = new Student("刘七", "男", 20,99.9);

        BigDecimal sum = new BigDecimal("0");

        sum = sum.add(new BigDecimal(stu1.getScore() + ""));
        sum = sum.add(new BigDecimal(stu2.getScore() + ""));
        sum = sum.add(new BigDecimal(stu3.getScore() + ""));
        sum = sum.add(new BigDecimal(stu4.getScore() + ""));
        sum = sum.add(new BigDecimal(stu5.getScore() + ""));

        BigDecimal avg = sum.divide(new BigDecimal("5"),2, RoundingMode.HALF_UP);

        System.out.println("平均分" + avg);

        double score1 = stu1.getScore();
        double score2 = stu2.getScore();
        double score3 = stu3.getScore();
        double score4 = stu4.getScore();
        double score5 = stu5.getScore();

//        double avg1 = (score1 + score2 + score3 + score4 + score5) / 5.0;
//        System.out.println(avg1);
    }
}
