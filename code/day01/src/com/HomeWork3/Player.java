package com.HomeWork3;

public class Player extends Person{

    private String classNumber;

    //空参构造
    public Player(){

    }

    //全参构造
    public Player(String id, String name, String gender,
                  int age, String classNumber) {

        super(id, name, gender, age);
        this.classNumber = classNumber;
    }

    public Player(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }


    /**
     * 获取
     * @return classNumber
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * 设置
     * @param classNumber
     */
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String toString() {
        return "Player{classNumber = " + classNumber + "}";
    }
}
