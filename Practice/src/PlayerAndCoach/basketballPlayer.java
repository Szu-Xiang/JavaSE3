package PlayerAndCoach;

public class basketballPlayer extends Player{

    public basketballPlayer() {
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

        System.out.println(getName() + "吃营养餐");
    }

    @Override
    public void study() {

        System.out.println(getName() + "学习打篮球");
    }
}
