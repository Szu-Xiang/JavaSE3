package HomeWork.HomeWork5;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        OpenandCloseThread t = new OpenandCloseThread();
        t.start();

        while (true) {
            if (t.flag) {
                break;
            }
        }

        Thread.sleep(3000);
        System.out.println(t.flag);
    }
}
