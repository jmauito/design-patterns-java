package com.jmauito.decorator.car;

public class Car extends CarComponent{
    public Car(String description, Double value)
    {
        this.description = description;
        this.value = value;
    }
    @Override
    public String getDescription()
    {
        return description;
    }
    @Override
    public Double getValue()
    {
        return value;
    }

    @Override
    public String view() {
        return "Description: " + description + ". Value: " + value;
    }


}
