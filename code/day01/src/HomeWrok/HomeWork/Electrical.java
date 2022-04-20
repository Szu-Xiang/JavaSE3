package HomeWrok.HomeWork;

public class Electrical {
    private String brand;
    private String number;
    private String color;
    private int price;


    public Electrical() {
    }

    public Electrical(String brand, String number, String color, int price) {
        this.brand = brand;
        this.number = number;
        this.color = color;
        this.price = price;
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
     * @return number
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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

    public void show() {
        System.out.println("品牌为：" + brand + "， " + "型号为：" + number + "， " + "售价为：" + price);
    }
}
