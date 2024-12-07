package com.jmauito.decorator.car;

public abstract class  CarComponent {
    protected String description;
    protected Double value;
    public abstract String getDescription();
    public abstract Double getValue();
    public abstract String view();
}
