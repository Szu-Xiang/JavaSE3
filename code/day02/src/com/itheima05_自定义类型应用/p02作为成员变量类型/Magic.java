package com.itheima05_自定义类型应用.p02作为成员变量类型;

public class Magic {

    private String name;

    public Magic() {
    }

    public Magic(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }



    public void attack() {
        System.out.println("aoe");
    }
}
