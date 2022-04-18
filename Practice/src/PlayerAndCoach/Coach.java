package PlayerAndCoach;

public abstract class Coach extends Human{

    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
