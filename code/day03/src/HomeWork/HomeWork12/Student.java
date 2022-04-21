package HomeWork.HomeWork12;

public class Student {
    private String name;
    private int age;
    private double height;
    private boolean marriage;
    private char gender;


    public Student() {
    }

    public Student(String name, int age, double height, boolean marriage, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.marriage = marriage;
        this.gender = gender;
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

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return marriage
     */
    public boolean isMarriage() {
        return marriage;
    }

    /**
     * 设置
     * @param marriage
     */
    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", height = " + height + ", marriage = " + marriage + ", gender = " + gender + "}";
    }

    public void show() {
        System.out.println("Student{name = " + name + ", age = " + age + ", height = " + height + ", marriage = " + marriage + ", gender = " + gender + "}");
    }

}
