package PlayerAndCoach;

public abstract class Player extends Human{

    public abstract void study();

    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
}
