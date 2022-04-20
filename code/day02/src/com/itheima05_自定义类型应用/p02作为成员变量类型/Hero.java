package com.itheima05_自定义类型应用.p02作为成员变量类型;

public class Hero {
    private String name;

    //类名作为成员变量
    private Weapon Wuqi;
    private Magic Fashu;

    public Hero() {
    }

    public Hero(String name, Weapon Wuqi, Magic Fashu) {
        this.name = name;
        this.Wuqi = Wuqi;
        this.Fashu = Fashu;
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

    /**
     * 获取
     * @return Wuqi
     */
    public Weapon getWuqi() {
        return Wuqi;
    }

    /**
     * 设置
     * @param Wuqi
     */
    public void setWuqi(Weapon Wuqi) {
        this.Wuqi = Wuqi;
    }

    /**
     * 获取
     * @return Fashu
     */
    public Magic getFashu() {
        return Fashu;
    }

    /**
     * 设置
     * @param Fashu
     */
    public void setFashu(Magic Fashu) {
        this.Fashu = Fashu;
    }

    public void showHero() {
        System.out.println("英雄名： " + name);
        System.out.println("武器名： " + getWuqi().getName());
        getWuqi().attack();
        System.out.println("技能名： " + getFashu().getName());
        getFashu().attack();
    }
}
