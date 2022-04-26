package HomeWork.HomeWork3.CopyonWriterArrayList;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //创建子线程对象并启动
        ArrayListThread t = new ArrayListThread();
        t.start();

        Thread.sleep(1000);

        //主线程
        for (int i = 101; i <= 200; i++) {
            t.list.add(i);
            System.out.print("第二个线程，添加101～200：");
            System.out.println(t.list.get(i - 1));
        }

    }
}
