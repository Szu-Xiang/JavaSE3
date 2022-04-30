package HomeWork.HomeWork1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    请定义一个可以存储“整数”的集合，并存储一些数据。
		请按以下要求顺序编程实现：
        对集合中的数据打乱顺序； 打印集合

        对集合中的数据进行升序排序 打印集合

        对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现) 打印集合


 */
public class listSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(51);
        list.add(15);
        list.add(35);
        list.add(55);

        Collections.shuffle(list);
        System.out.println("1.打乱后：" + list);

        Comparator<Integer> ic = new Comparator<Integer> (){
            @Override
            public int compare(Integer o1, Integer o2) {
                //升序排列
                return o1 - o2;
            }
        };
        list.sort(ic);
        System.out.println("升序排列：" + list);

        Comparator<Integer> ic2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        list.sort(ic2);
        System.out.println("降序排列：" + list);



    }
}
