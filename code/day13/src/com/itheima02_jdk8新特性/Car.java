package com.itheima02_jdk8新特性;

import java.util.function.Supplier;

class Car {
    //Supplier是jdk1.8的接口，这里和lambda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }
}