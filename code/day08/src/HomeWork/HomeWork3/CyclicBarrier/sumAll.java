package HomeWork.HomeWork3.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class sumAll extends Thread{
    int sum = 0;

    public CyclicBarrier c;

    public sumAll(CyclicBarrier c, String name) {
        super(name);
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(getName() + sum);

    }
}
