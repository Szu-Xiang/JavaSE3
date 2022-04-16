package HomeWork.HomeWork2;

public class BMWMotor extends Motor{

    public BMWMotor(int price) {

        super("宝马", "摩托车", price);
    }

    public void positioning() {
        System.out.println("正在定位");
    }
}
