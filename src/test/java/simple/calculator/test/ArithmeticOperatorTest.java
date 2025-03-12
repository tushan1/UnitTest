package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    ArithmeticOperator cal;

    @BeforeMethod
    public void setUp() {
       cal = new ArithmeticOperator();
    }

    @Test
    public void testSum() {
        int inputData1 = 100;
        int inputData2 = 240;
        int expectedResult = inputData1+inputData2;
        int actualValue = cal.sum(inputData1,inputData2);

        Assert.assertEquals(actualValue,expectedResult,"Failed to calculate sum: " );
    }
}
