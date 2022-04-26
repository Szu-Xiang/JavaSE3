package HomeWork.HomeWork3.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class sumEven extends Thread{
    int sum = 0;

    public CyclicBarrier c;

    public sumEven(CyclicBarrier c, String name) {
        super(name);
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(getName() + sum);
    }
}
