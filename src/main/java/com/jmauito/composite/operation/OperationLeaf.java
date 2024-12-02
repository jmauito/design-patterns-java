package com.jmauito.composite.operation;

public class OperationLeaf implements Operation{

    private final Integer value;

    public OperationLeaf(Integer value) {
        this.value = value;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void add(Operation operation) {
        // Nothing to do
    }

    @Override
    public void remove(Operation operation) {
        // Nothing to do
    }

    @Override
    public double calculate() throws IllegalArgumentException {
        return value;
    }
}
