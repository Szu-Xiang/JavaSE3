package PlayerAndCoach;

public class pingpongPlayer extends Player implements studyEnglish{

    public pingpongPlayer() {
    }

    public pingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }

    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }
}
