package HomeWork.HomeWork2;

public class BMWCar extends Car implements GPS{

    @Override
    public void positioning() {
        System.out.println("正在定位中");
    }

    public BMWCar(int price) {
        super("宝马", "汽车", price);
    }
}
