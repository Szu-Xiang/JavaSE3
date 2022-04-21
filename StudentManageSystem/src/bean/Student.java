package bean;

public class Student extends Person{

    public Student() {
    }

    public Student(String id, String name, String birthday, int age, String gender) {
        super(id, name, birthday, age, gender);
    }

    @Override
    public String describe() {

        return "我是学生，我爱学习";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
