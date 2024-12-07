package com.jmauito.decorator.app;

import com.jmauito.decorator.car.Accessory;
import com.jmauito.decorator.car.Car;
import com.jmauito.decorator.car.CarComponent;
import com.jmauito.decorator.car.CarDecorator;

public class Main {
    public static void main(String[] args) {
        CarComponent car = new Car("Chevrolet Aveo", 14000D);
        CarDecorator gpsAccessory = new Accessory(car);
        gpsAccessory.setDescription("GPS");
        gpsAccessory.setValue(100D);
        CarDecorator radio = new Accessory(gpsAccessory);
        radio.setDescription("Radio with Bluetooth");
        radio.setValue(300D);
        CarDecorator eds = new Accessory(radio);
        eds.setDescription("EDS");
        eds.setValue(500D);
        System.out.println(car.view());
        System.out.println(gpsAccessory.view());
        System.out.println(radio.view());
        System.out.println(eds.view());
    }
}
