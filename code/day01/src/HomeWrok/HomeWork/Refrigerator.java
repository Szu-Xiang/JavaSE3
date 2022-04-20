package HomeWrok.HomeWork;

public class Refrigerator extends Electrical{

    private String doorStyle;
    private String refrigerationMode;

    //空参构造
    public Refrigerator(){

    }

    //全参构造
    public Refrigerator(String brand, String number, String color,
                        int price, String doorStyle, String refrigerationMode) {
        super(brand, number, color, price);
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }


    public Refrigerator(String doorStyle, String refrigerationMode) {
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }

    /**
     * 获取
     * @return doorStyle
     */
    public String getDoorStyle() {
        return doorStyle;
    }

    /**
     * 设置
     * @param doorStyle
     */
    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    /**
     * 获取
     * @return refrigerationMode
     */
    public String getRefrigerationMode() {
        return refrigerationMode;
    }

    /**
     * 设置
     * @param refrigerationMode
     */
    public void setRefrigerationMode(String refrigerationMode) {
        this.refrigerationMode = refrigerationMode;
    }

    public String toString() {
        return "Refrigerator{doorStyle = " + doorStyle + ", refrigerationMode = " + refrigerationMode + "}";
    }
}
