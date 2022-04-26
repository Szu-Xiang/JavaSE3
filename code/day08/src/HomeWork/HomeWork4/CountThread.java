package HomeWork.HomeWork4;

public class CountThread extends Thread{
    int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                count++;
            }
        }
    }
}
