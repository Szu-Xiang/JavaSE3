package HomeWork.HomeWork3.Exchange;

import java.util.concurrent.Exchanger;

public class Test {
    public static void main(String[] args) {
        Exchanger<String> e = new Exchanger<>();

        new AThread(e,"A线程").start();
        new BThread(e,"B线程").start();
    }
}
