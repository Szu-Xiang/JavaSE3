package com.吃包子案例;

public class ChiHuoThread extends Thread{
    private BaoZi bz;

    public ChiHuoThread(BaoZi bz, String name) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if(!bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(getName() + ":吃" + bz.pier + bz.xianer + "的包子");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = false;
                //通知别人做包子
                bz.notify();
            }
        }
    }
}
