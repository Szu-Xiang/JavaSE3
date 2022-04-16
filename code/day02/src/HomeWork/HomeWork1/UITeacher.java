package HomeWork.HomeWork1;

public abstract class UITeacher extends Employee implements Painting{

    public void Painting() {
        System.out.println("Teaching painting");
    }

    @Override
    public void Work() {
        System.out.println("UI teacher is teaching.");
    }

}
