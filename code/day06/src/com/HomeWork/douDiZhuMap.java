package com.HomeWork;

/*
    需求:
    按照斗地主规则，完成造牌-洗牌-发牌-看牌的动作，要求按照牌面大小看牌。
    牌面展示规则：【大王,小王,♠2,♥2,♣2,♦2,♠A,♥A,♣A,♦A....】
分析:
    准备牌:见图。
    洗牌--发牌--看牌：使用牌号操作

步骤:
    1.造牌
    	将牌盒设计为一个HashMap<Integer，String>集合
    	将牌号作为键，制作的牌面作为值，按照映射关系，放进牌盒
    	使用一个ArrayList集合记录所有牌号
    2.洗牌
    使	用Collections类的shuffle方法对牌号进行打乱
    3.发牌
    	为每个玩家和底牌各分配一个ArrayList<Integer>记录牌号。
    	遍历牌号，通过对3取模，将牌号分配给各玩家
    	遍历中，留3张牌号，存放于底牌集合中
    4.看牌
    	对玩家和底牌牌号排序
    	遍历玩家和底牌牌号，通过获取的牌号展示牌面
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class douDiZhuMap {
    public static void main(String[] args) {
        //新建牌盒
        HashMap<Integer, String> pokerBox = new HashMap<>();
        //新建牌号
        ArrayList<Integer> pokerNums = new ArrayList<>();

        int index = 54;
        //添加大王
        pokerNums.add(index);
        pokerBox.put(index--, "Big 🃏");
        //添加小王
        pokerNums.add(index);
        pokerBox.put(index--, "Small 🃏");

        //花色数组
        String[] colors = "♠️,♥️,♣️,♦️".split(",");
        //数字数组
        String[] nums = "2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");

        //通过循环嵌套，组合出所有的牌，并将牌放入到牌盒中
        for (String num : nums) {
            for (String color : colors) {
                String poker = color + num;

                pokerNums.add(index);
                pokerBox.put(index--,poker);
            }
        }
        System.out.println(pokerBox);

        //洗牌(洗的是牌号)
        Collections.shuffle(pokerNums);

        //发牌
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < pokerNums.size(); i++) {
            //获取牌号
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

//        System.out.println(play1);
//        System.out.println(play2);
//        System.out.println(play3);
//        System.out.println(diPai);

        String name1 = "周润发";
        showPoker(pokerBox,play1,name1);

        String name2 = "刘德华";
        showPoker(pokerBox,play2,name2);

        String name3 = "张学友";
        showPoker(pokerBox,play3,name3);

        String di = "底牌";
        showPoker(pokerBox,diPai,di);

    }

    public static void showPoker(HashMap<Integer, String> pokerBox, ArrayList<Integer> pokerNum, String name) {
        //对牌号进行排序
        Collections.sort(pokerNum);

        //展示牌
        System.out.print(name + ": ");
        System.out.print("[");

        for (Integer number : pokerNum) {
            String poker = pokerBox.get(number);
            System.out.print(poker + " ");
        }

        System.out.println("]");
    }
}
