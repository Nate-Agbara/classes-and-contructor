package com.learning;

import java.awt.*;

public class Car {
    int height;
    double diameter;
    CarType carType;
    public static Color COLOR = new Color(12, 23, 1);

    public Car(int height, double diameter, CarType carType){
        this.height = height;
        this.diameter = diameter;
        this.carType = carType;
    }

    public static void announceCar(){
        System.out.println("Look out for that car");
    }
}
