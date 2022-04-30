package HomeWork;

public class HomeWork5 {
    public static void main(String[] args) {
        //递归计算1～100的和
        int result = getSum(100);
        System.out.println(result);
    }
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + getSum(num - 1);
        }
    }
}
