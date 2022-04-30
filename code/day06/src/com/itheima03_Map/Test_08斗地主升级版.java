package com.itheima03_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

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
public class Test_08斗地主升级版 {
    public static void main(String[] args) {

        /*
            造牌
         */
        //牌盒
        HashMap<Integer, String> pokerBox = new HashMap<>();
        //牌号
        ArrayList<Integer> pokerNum = new ArrayList<>();
        //造牌并将牌号添加到牌盒中
        int index = 54;
        //添加大王
        pokerNum.add(index);
        pokerBox.put(index--, "Big 🃏");

        //添加小王
        pokerNum.add(index);
        pokerBox.put(index--,"Small 🃏");

        //花色数组
        String[] colors = "♠️, ♥️, ♣️,♦️".split(",");
        //牌号数组
        String[] nums = "2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");

        //通过循环嵌套，组合出所有的牌，并将牌放入到牌盒中
        for (String num : nums) {
            for (String color : colors) {
                //组合出牌
                String poker = color + num;
                //将牌放入牌盒中
                pokerNum.add(index);
                pokerBox.put(index--,poker);
            }
        }
        System.out.println(pokerBox);

        //洗牌(洗的是牌号)
        Collections.shuffle(pokerNum);

        //发牌
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for(int i = 0; i < pokerNum.size(); i++) {
            //获取牌号
            Integer num = pokerNum.get(i);

            //
            if(i >= 51) {
                diPai.add(num);
            } else if(i % 3 == 0) {
                play1.add(num);
            } else if (i % 3 == 1) {
                play2.add(num);
            } else {
                play3.add(num);
            }
        }

        String name1 = "周润发 ";
        method1(pokerBox, play1,name1);

        String name2 = "刘德华";
        method1(pokerBox, play2, name2);

        String name3 = "张学友";
        method1(pokerBox, play3, name3);

        String name4 = "底牌";
        method1(pokerBox, diPai, name4);


    }

    public static void method1(HashMap<Integer, String> pokerBox, ArrayList<Integer> play1, String name) {
        //对牌号进行排序
        Collections.sort(play1);

        //看牌，将牌号对应牌输出出来
        System.out.print(name);
        System.out.print("[");

        for (Integer pokernum1 : play1) {
            String poker = pokerBox.get(pokernum1);
            System.out.print(poker + " ");
        }

        System.out.println("]");
    }
}
