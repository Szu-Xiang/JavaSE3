package HomeWork.HomeWork11;

import java.util.Scanner;

public class package1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入分数：");
        String scorestr = sc.nextLine();

        int score = Integer.parseInt(scorestr);

        System.out.println(score + 5);


    }
}
