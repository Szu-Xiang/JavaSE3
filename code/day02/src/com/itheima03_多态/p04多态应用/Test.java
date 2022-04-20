package com.itheima03_多态.p04多态应用;

import com.itheima03_多态.p01多态入门.Animal;
import com.itheima03_多态.p01多态入门.Cat;
import com.itheima03_多态.p01多态入门.Dog;

/*
1.应用场景
	变量多态的使用     父类/接口名  变量名   = 子类/实现类对象;(同一个变量,可以指向不同的子类或实现类对象)
	形参多态的使用	修饰符	返回值类型 方法名(父类/接口名 变量名){  变量名.方法名(); }
	返回值类型多态的使用	修饰符 	父类/接口名 方法名(参数) { return 子类/实现类对象; }
示例:
    动物
        行为:吃
    猫
        行为:
            吃
    狗
        行为:
            吃
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        a = new Dog();
        a.eat();

        //形参不使用多态
        Cat c = new Cat();
        showCat(c);
        Dog d = new Dog();
        showDog(d);

        //形参使用多态
        showAnimal(c);
        showAnimal(d);

        //返回值多态的使用
        Animal a3 = getAnimal("猫");
        a3.eat();

        Animal a4 = getAnimal("狗");
        a4.eat();

    }

    //形参多态的使用：修饰符 返回值 方法名 (父类名 变量名)

    public static void showAnimal(Animal a) {

        a.eat();
    }

    public static void showCat(Cat c) {

        c.eat();
    }

    public static void showDog(Dog d) {

        d.eat();
    }

    //返回值多态的使用
    public static Animal getAnimal(String type) {

        Animal a = null;
        if(type.equals("猫")) {
            a = new Cat();
        } else if (type.equals("狗")) {
            a = new Dog();
        }

        return a;
    }
}
