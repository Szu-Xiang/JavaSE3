package HomeWork.HomeWork2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    请定义一个Collection类型的集合，存储以下分数信息：

            88.5,39.2,77.1,56.8,89,99,59.5

请编程实现以下功能：

使用增强for遍历所有元素，并打印

使用增强for遍历所有元素，打印不及格的分数；

使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。

使用增强for遍历所有元素，求出最高分，并打印；

 */
public class ForTest {
    public static void main(String[] args) {
        Collection<Double> c = new ArrayList<>();

        c.add(88.5);
        c.add(39.2);
        c.add(77.1);
        c.add(56.8);
        c.add(89.0);
        c.add(99.0);
        c.add(59.5);

        //获取迭代器
        Iterator<Double> it = c.iterator();

        //使用增强for遍历所有元素，并打印
//        for (Double d : c) {
//            System.out.println(d);
//        }

        //使用增强for遍历所有元素，打印不及格的分数；
//        for (Double d : c) {
//            if(d < 60.0) {
//                System.out.println(d);
//            }
//        }

        //使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        double count = 0;
        double sum = 0;


        for (Double d : c) {
            if(d < 60.0) {
                count ++;
                sum += d;
            }
        }
        int ct = (int) count;
        System.out.println(ct);

        BigDecimal b1 = new BigDecimal(sum);
        BigDecimal b2 = new BigDecimal(count);

        System.out.println(b1.divide(b2, 2, RoundingMode.HALF_UP));


        //使用增强for遍历所有元素，求出最高分，并打印；

    }

}
