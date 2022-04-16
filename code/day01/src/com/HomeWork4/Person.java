package com.HomeWork4;

public abstract class Person {
    private String jobID;
    private String name;
    private int age;


    public Person() {
    }

    public Person(String jobID, String name, int age) {
        this.jobID = jobID;
        this.name = name;
        this.age = age;
    }

    //发布通知
    public void Notice(String content) {
        System.out.println("通知：");
        setContent(content);
        System.out.println("\t 必胜环球科技有限公司");
    }


    /**
     * 获取
     * @return jobID
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * 设置
     * @param jobID
     */
    public void setJobID(String jobID) {
        this.jobID = jobID;
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
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public abstract void setContent(String content);



}
