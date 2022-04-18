package CatAndDog;

public class Test {
    public static void main(String[] args) {

        showAnimal(new Cat());
    }

    public static void showAnimal(Animal a) {

        a.eat();

        if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHouse();
        }
    }

}
