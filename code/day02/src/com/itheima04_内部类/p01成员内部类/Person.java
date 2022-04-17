package com.itheima04_内部类.p01成员内部类;

public class Person {

    private boolean live = true;

    public boolean isLive() {
        return live;
    }

    public Person() {

    }
    public Person(boolean live) {
        this.live = live;
    }

    /**
     * 设置
     * @param live
     */
    public void setLive(boolean live) {
        this.live = live;
    }

    public String toString() {
        return "Human{live = " + live + "}";
    }


    class Heart {

        public void jump() {
            if(live) {
                System.out.println("Dong ... Dong ...");
            } else {
                System.out.println("Di---------");
            }
        }

    }
}
