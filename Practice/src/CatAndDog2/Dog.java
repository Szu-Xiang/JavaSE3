package CatAndDog2;

public class Dog extends Animal implements Jumping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jumpHigh() {
        System.out.println("狗被训练跳高");
    }
}
