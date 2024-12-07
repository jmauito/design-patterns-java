package com.jmauito.decorator.car;

public class Accessory extends CarDecorator{

    public Accessory(CarComponent component) {
        super(component);
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " + " + this.description;
    }

    @Override
    public Double getValue() {
        return component.getValue() + this.value;
    }

    @Override
    public String view() {
        return "Description: " + getDescription() + ". Value: " +  getValue();
    }

}
