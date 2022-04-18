package CatAndDog;

public class Dog extends Animal{

    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookHouse() {

        System.out.println("狗会看家");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
