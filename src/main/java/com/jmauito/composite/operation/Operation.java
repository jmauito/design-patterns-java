package com.jmauito.composite.operation;

public interface Operation {

    boolean isComposite();

    void add(Operation operation);
    void remove(Operation operation);
    double calculate() throws IllegalArgumentException;
}
