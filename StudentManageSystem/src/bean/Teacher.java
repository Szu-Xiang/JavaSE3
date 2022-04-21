package bean;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String id, String name, String birthday, int age, String gender) {
        super(id, name, birthday, age, gender);
    }

    @Override
    public String describe() {
        return "我是老师，我爱教课";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
