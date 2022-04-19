package bean;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String id, String name, String birthday, int age, String gender) {
        super(id, name, birthday, age, gender);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String describe() {
        return "我是一名老师";
    }
}
