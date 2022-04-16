package HomeWork.HomeWork2;

public class Vehicle {

    private String brand;
    private String type;
    private int price;

    public Vehicle() {
    }

    public Vehicle(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }


    //成员方法
    public void run() {
        System.out.println("价值为：" + price + "的" + brand + "车正在运行");
    }


    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Vehicle{brand = " + brand + ", type = " + type + ", price = " + price + "}";
    }
}
