package HomeWork.HomeWork3;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class demoLHS {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        lhs.add(20);
        lhs.add(30);
        lhs.add(50);
        lhs.add(10);
        lhs.add(30);
        lhs.add(20);

        ts.add(20);
        ts.add(20);
        ts.add(50);
        ts.add(10);
        ts.add(30);

        int size = lhs.size();
        //去重，size返回为4
        System.out.println("集合大小：" + size);

        System.out.print("集合中大于25的有：");
        for (Integer lh : lhs) {
            if (lh > 25) {
                System.out.print(lh + "  ");
            }
        }

        System.out.println();
        for (Integer t : ts) {
            if (t > 25) {
                System.out.print(t);
            }
        }
    }
}
