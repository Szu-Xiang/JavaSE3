package HomeWork.HomeWork1;

/*
1.  请定义“员工(类)”：
	属性：姓名、性别、年龄(全部私有)
	行为：工作(抽象)
	无参、全参构造方法
	get/set方法
2.	请定义“绘画(接口)”
	抽象方法：绘画
3.	请定义“Java讲师类”继承自“员工类”
4.	请定义”UI讲师类”，继承自“员工类”，并实现“绘画”接口。

 */

public abstract class Employee {

    private String name;
    private String gender;
    private int age;

    //定义一个工作的抽象方法
    public abstract void Work();


    public Employee() {
    }

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
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
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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


}
