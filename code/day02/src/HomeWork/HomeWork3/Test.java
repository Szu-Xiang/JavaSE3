package HomeWork.HomeWork3;

public class Test {
    public static void main(String[] args) {

        //多态格式：父类/接口类型 对象名 = new 子类/实现类对象
        Animal a = new Cat();
        a.eat();

        //无法调用子类中特有的方法
        //a.catchMouse();

    }
}
