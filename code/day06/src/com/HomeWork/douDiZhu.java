package com.HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class douDiZhu {
    public static void main(String[] args) {
        //牌盒
        HashMap<Integer, String> pokerBox = new HashMap<>();

        //牌号
        ArrayList<Integer> pokerNums = new ArrayList<>();

        //添加牌
        int index = 54;
        pokerNums.add(index);
        pokerBox.put(index--, "大🃏");

        pokerNums.add(index);
        pokerBox.put(index--, "小🃏");

        //花色数组
        String[] colors = "♠️,♥️,♣️,♦️".split(",");
        //数字数组
        String[] nums = "2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");

        //组合牌放入牌盒中，按照♠️>♥️>♣️>♦️,数字按照斗地主规则
        for (String num : nums) {
            for (String color : colors) {
                String poker = color + num;
                pokerNums.add(index);
                pokerBox.put(index--,poker);
            }
        }
        //System.out.println(pokerBox);

        //洗牌
        Collections.shuffle(pokerNums);

        //创建玩家和底牌集合
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //发牌
        for (int i = 0; i < pokerNums.size(); i++) {
            //获取牌号对象
            Integer num = pokerNums.get(i);
            if(i >= 51) {
                diPai.add(num);
            } else if(i % 3 == 0) {
                play1.add(num);
            } else if(i % 3 == 1) {
                play2.add(num);
            } else {
                play3.add(num);
            }
        }

        //展示牌
        String name1 = "周润发";
        showPoker(pokerBox,play1,name1);

        String name2 = "会发光的翔";
        showPoker(pokerBox,play2,name2);

        String name3 = "刘德华";
        showPoker(pokerBox,play3,name3);

        String name4 = "底牌";
        showPoker(pokerBox,diPai,name4);
    }

    public static void showPoker(HashMap<Integer, String> pokerBox, ArrayList<Integer> pokerNums, String name) {
        //排序
        Collections.sort(pokerNums);

        //展示牌
        System.out.print(name + ": ");
        System.out.print("[");

        for (Integer number : pokerNums) {
            String poker = pokerBox.get(number);
            System.out.print(poker + " ");
        }
        System.out.println("]");

    }
}
