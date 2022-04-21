package douDiZhu;

import java.util.ArrayList;
import java.util.Collections;

/*
    需求:
    按照斗地主的规则，完成造牌发牌看牌的动作。
    具体规则：使用54张牌,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
分析
    步骤:造牌--(洗牌)--发牌--看牌
    造牌:产生54张由花色和牌号组成的(字符串)牌面存入集合
    发牌:指定4个集合，代表三个玩家和底牌，将集合中的牌分发到四个集合中
    看牌:遍历集合查看牌面
思路:
    造牌:创建集合--创建花色数组和牌号数组--利用循环嵌套拼接53张牌,并添加到集合--添加大王和小王
    发牌:定义四个集合代表玩家和底牌--(普通for)遍历牌盒拿到每张牌，并根据索引对3取余，将牌分发给四个集合。
    看牌:打印四个集合对象
 */
public class pokerBox {
    public static void main(String[] args) {

        //创造牌盒
        ArrayList<String> pokerbox = new ArrayList<>();

        //定义花色数组
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        //定义牌号数组
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String color : colors) {
            for (String number : numbers) {
                //获取一张牌
                String card = color + number;
                //添加到牌盒中
                pokerbox.add(card);
            }
        }

        //添加大小王
        pokerbox.add("Big 🃏");
        pokerbox.add("Small 🃏");

        //洗牌
        Collections.shuffle(pokerbox);

        //发牌
        /*
            创建三个玩家和底牌
         */

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int i = 0; i < 54; i++) {
            //创建单张牌对象，添加到玩家、底牌队列中
            String card = pokerbox.get(i);
            if(i >= 51) {
                //留底牌
                dipai.add(card);
            } else if(i % 3 ==0) {
                player1.add(card);
            } else if(i % 3 ==1) {
                player2.add(card);
            } else {
                player3.add(card);
            }
        }

        //看牌
        System.out.println("周润发" + player1);
        System.out.println("刘德华" + player2);
        System.out.println("古天乐" + player3);
        System.out.println("底牌" + dipai);

    }
}
