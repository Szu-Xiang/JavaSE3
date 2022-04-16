package com.itheima03_Map;

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

    }
}
