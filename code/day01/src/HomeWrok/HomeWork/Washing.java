package HomeWrok.HomeWork;

public class Washing extends Electrical{

    private String motorType;
    private String washingCapacity;

    public Washing() {

    }

    public Washing(String brand, String number, String color,
                   int price, String motorType, String washingCapacity) {
        super(brand, number, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }


    public Washing(String motorType, String washingCapacity) {
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    /**
     * 获取
     * @return motorType
     */
    public String getMotorType() {
        return motorType;
    }

    /**
     * 设置
     * @param motorType
     */
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    /**
     * 获取
     * @return washingCapacity
     */
    public String getWashingCapacity() {
        return washingCapacity;
    }

    /**
     * 设置
     * @param washingCapacity
     */
    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }

    public String toString() {
        return "Washing{motorType = " + motorType + ", washingCapacity = " + washingCapacity + "}";
    }
}
