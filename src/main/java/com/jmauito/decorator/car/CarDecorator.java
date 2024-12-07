package com.jmauito.decorator.car;

public abstract class CarDecorator extends CarComponent{
    protected CarComponent component;

    public CarDecorator(CarComponent component)
    {
        this.component = component;
    }

    public abstract void setDescription(String description);

    public abstract void setValue(Double value);

}
