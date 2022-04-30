package HomeWork;

public class HomeWork4 {
    public static void main(String[] args) {
        //打印8的阶乘
        int result = factorial(8);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 2;
        } else {
            return num * factorial(num - 1);
        }
    }
}
