package HomeWork.HomeWork4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
    双色球规则，双色球每注投注号码由6个1—33的号码和1个1—16的号码组成。
    其中6个1-33的数字要求不能重复。请随机生成一注双色球号码
 */
public class lotteryTicket {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //新建集合，存放中奖号码
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        //获取随机数
        Random r = new Random();

        //红色球：1～33，6个，不能重复
        int nums = 0;
        for(int j = 0; j < 6; j++) {
            nums = r.nextInt(33) + 1;
            //去重
            if(arr.contains(nums)) {
                j--;
            } else {
                arr.add(nums);
            }
        }
        //System.out.println(arr);
        //排序
        Collections.sort(arr);

        //蓝色球：1～16，1个
        int blueNum = r.nextInt(16) + 1;
        //中奖数字添加到集合中
        arr.add(blueNum);
        //输出集合
        System.out.println("中奖号码（红6 + 蓝1）为： " + arr);

        putRedNum();
    }

    //用户添加红球的方法
    public static void putRedNum() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int redNum = sc.nextInt();
            //判断是否重复
            boolean flag = contains(arr,redNum);
            if (flag) {
                arr.add(redNum);
            }

        }
    }

    //判断红球是否重复方法
    public static boolean contains(ArrayList arr, int num) {
        if (arr.contains(num)) {
            return true;
        } else {
            return false;
        }
    }

//    public static void get
}
