package com.jmauito.decorator;

import com.jmauito.decorator.car.Accessory;
import com.jmauito.decorator.car.Car;
import com.jmauito.decorator.car.CarComponent;
import com.jmauito.decorator.car.CarDecorator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {
    @Test
    public void shouldRetrieveACarWithGPSRadioAndEDSComponents()
    {
        String expectedDescription = "Description: Chevrolet Aveo + GPS + Radio with Bluetooth + EDS. Value: 14900.0";
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

        assertEquals(expectedDescription, eds.view());

    }
}
