package CatAndDog2;

public class Cat extends Animal implements Jumping{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jumpHigh() {
        System.out.println("猫被训练跳高");
    }
}
