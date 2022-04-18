package PlayerAndCoach;

public class basketballCoach extends Coach{

    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
