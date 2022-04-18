package PlayerAndCoach;

public class pingpongCoach extends Coach implements studyEnglish{

    public pingpongCoach() {
    }

    public pingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }

    @Override
    public void studyEnglish() {
        System.out.println("学习英语");
    }
}
