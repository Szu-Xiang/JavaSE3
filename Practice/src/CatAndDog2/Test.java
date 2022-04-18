package CatAndDog2;

public class Test {

    public static void main(String[] args) {

        //创建对象，调用方法
        Cat c = new Cat();//使用具体的实现类，因为包括了最多的实现方法
        c.eat();
        c.jumpHigh();

        Animal a = new Cat();
        a.eat();

    }
}
