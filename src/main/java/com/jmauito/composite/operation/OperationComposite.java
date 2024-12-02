package com.jmauito.composite.operation;

import java.util.ArrayList;
import java.util.List;

public class OperationComposite implements Operation{
    private final Character operator;
    private final List<Operation> operations;

    public OperationComposite(Character operator) {
        this.operator = operator;
        this.operations = new ArrayList<>();
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public void add(Operation operation) {
        operations.add(operation);
    }

    @Override
    public void remove(Operation operation) {
        operations.remove(operation);
    }

    @Override
    public double calculate() throws IllegalArgumentException {

        switch (operator) {
            case '+' -> {
                return sum();
            }
            case '-' -> {
                return substract();
            }
            case '*' -> {
                return multiply();
            }
            case '/' -> {
                return divide();
            }
            default -> throw new IllegalArgumentException("Unexpected value: " + operator);
        }

    }

    private double sum() {
        return operations.stream().mapToDouble(Operation::calculate).sum();
    }

    private double substract() {
        double result = operations.get(0).calculate();
        for(int i=1; i < operations.size(); i++) {
            result -= operations.get(i).calculate();
        }
        return result;
    }

    private double multiply() {
        double result = 1;
        for (Operation operation : operations) {
            result *= operation.calculate();
        }
        return result;
    }

    private double divide() {
        double result = operations.get(0).calculate();
        for(int i=1; i < operations.size(); i++) {
            result /= operations.get(i).calculate();
        }
        return result;
    }

}
