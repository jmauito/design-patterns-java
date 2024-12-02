package com.jmauito.composite;

import com.jmauito.composite.operation.Operation;
import com.jmauito.composite.operation.OperationComposite;
import com.jmauito.composite.operation.OperationLeaf;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertTrue;

public class OperationTest {

    @Test
    public void shouldReturnsResultToAddFivePlusFour()
    {
        Double expectedValue = 9.00;
        Operation operator = new OperationComposite('+');
        Operation number1 = new OperationLeaf(5);
        Operation number2 = new OperationLeaf(4);
        operator.add(number1);
        operator.add(number2);
        assertTrue(expectedValue.equals(operator.calculate()));

    }

    @Test
    public void shouldReturnsFiveAsResultOfOperation()
    {
        /*
        * Formula to evaluate: =(((5+8)-3)*2)/4 = 5
        * */

        Double expectedResult = 5.00;

        Operation operation1 = new OperationComposite('+');
        Operation operation2 = new OperationComposite('-');
        Operation operation3 = new OperationComposite('*');
        Operation operation4 = new OperationComposite('/');
        Operation number1 = new OperationLeaf(5);
        Operation number2 = new OperationLeaf(8);
        Operation number3 = new OperationLeaf(3);
        Operation number4 = new OperationLeaf(2);
        Operation number5 = new OperationLeaf(4);
        operation1.add(number1);
        operation1.add(number2);

        operation2.add(operation1);
        operation2.add(number3);

        operation3.add(operation2);
        operation3.add(number4);

        operation4.add(operation3);
        operation4.add(number5);

        assertTrue(expectedResult.equals(operation4.calculate()));

    }

    @Test
    public void shouldThrowAnIllegalArgumentExceptionWhenReceivingAnInvalidOperator()
    {
        Operation operation = new OperationComposite('x');
        assertThrows(IllegalArgumentException.class, operation::calculate);
    }
}
