package HomeWork.HomeWork3.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) {
        //新建任务对象
        sumRunnable r = new sumRunnable();

        //新建CyclicBarrier对象
        CyclicBarrier c = new CyclicBarrier(3,r);

        new sumAll(c,"1～100的总和为：").start();
        new sumOdd(c,"1～100的奇数总和为：").start();
        new sumEven(c,"1～100的偶数总和为：").start();


    }
}
