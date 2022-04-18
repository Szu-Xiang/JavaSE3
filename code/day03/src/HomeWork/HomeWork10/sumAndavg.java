package HomeWork.HomeWork10;
/*
    有以下double数组：
		double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
	请编程计算它们的总值及平均值(四舍五入保留小数点后2位)

 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class sumAndavg {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};

        BigDecimal sum = new BigDecimal("0");

        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(new BigDecimal(arr[i] + ""));
        }

        System.out.println(sum);

        BigDecimal avg = sum.divide(new BigDecimal(arr.length), 2, RoundingMode.HALF_UP);
        System.out.println(avg);


    }
}
