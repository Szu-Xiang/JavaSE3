package HomeWork.HomeWork2;

/*
    一个机动车管理系统中有以下类的设计：
	机动车类：
		|--汽车类：
			|--奔驰车
			|--宝马车
		|--摩托车类：
			|--雅马哈摩托
			|--宝马摩托
	所有的车都有如下信息：
	属性：品牌、价格
	行为：运行
现在要求为所有“宝马车系”的汽车增加一个GPS功能。

 */
public class Car extends Vehicle{
    //空参构造
    public Car() {
    }

    //全参构造
    public Car(String brand, String type, int price) {
        super(brand, "汽车",price);  //确定类型为汽车
    }


}



