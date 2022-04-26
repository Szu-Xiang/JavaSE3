package HomeWork.HomeWork4;

public class Test {
    public static void main(String[] args) {
        //创建开关线程对象并启动
        //同步机制解决可见性
        //OpenCloseThread t = new OpenCloseThread();

        //volatile解决可见性
        OpenCloseThread2 t = new OpenCloseThread2();
        t.start();

        while (true) {
            //synchronized (t) {
                if(t.flag) {
                    break;
                }
            //}
        }
        System.out.println("主线程结束了");
    }
}
