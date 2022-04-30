package com.吃包子案例;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz, String name) {
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int index = 0;

        while(true) {
            synchronized (bz) {
                if(bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果没有包子 或者 包子被吃完了
                //做包子
                if (index % 2 ==0) {
                    bz.pier = "白面皮";
                    bz.xianer = "芹菜猪肉";
                } else {
                    bz.pier = "玉米面";
                    bz.xianer = "酸菜猪肉";
                }
                index ++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "包子做好了");
                //修改包子状态
                bz.flag = true;
                //告诉吃货 能吃包子了
                bz.notify();
            }
        }


    }
}
