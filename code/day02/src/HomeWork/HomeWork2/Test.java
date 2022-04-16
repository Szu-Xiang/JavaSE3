package HomeWork.HomeWork2;

public class Test {
    public static void main(String[] args) {

        //汽车
        BenzCar benzCar = new BenzCar(480000);
        benzCar.run();

        BMWCar bmwCar = new BMWCar(540000);
        bmwCar.run();
        bmwCar.positioning();

        //摩托车
        BMWMotor bmwMotor = new BMWMotor(15000);
        bmwMotor.positioning();
    }
}
