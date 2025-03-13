package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest3 {
    ArithmeticOperator cal;

    @BeforeMethod
    public void setUp() {
        cal = new ArithmeticOperator();
    }

    @Test(dataProvider = "getData")
    public void testSum(int num1, int num2, int expectedResult) {
        Assert.assertEquals(cal.sum(num1, num2), expectedResult);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {100,200,300},
                {-100,-200,-200},
                {0,1,1},
                {0,-1,-1}
        };
    }

}
