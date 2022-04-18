package JiDuDog;

public class JiDuDog extends Dog implements JiDu{

    @Override
    public void eat() {
        System.out.println("吃军粮");
    }

    @Override
    public void JiDu() {
        System.out.println("用鼻子闻");
    }

}
