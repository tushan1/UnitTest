package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest2 {

    ArithmeticOperator cal;

    @BeforeMethod
    public void setUp() {
        cal = new ArithmeticOperator();
    }

    //@Test
    public void testSum() {
        Assert.assertEquals(cal.sum(100, 200), 300);
        System.out.println("**** Prior Assertion ****");
        Assert.assertEquals(cal.sum(-100, -200), -200);
        System.out.println("**** After Assertion ****");
        Assert.assertEquals(cal.sum(-1, 0), -1);
        Assert.assertEquals(cal.sum(1, 0), 1);
    }

    @Test
    public void testSum1() {
        Assert.assertEquals(cal.sum(100, 200), 300);

    }

    @Test
    public void testSum2() {
        Assert.assertEquals(cal.sum(-100, -200), -200);

    }

    @Test
    public void testSum3() {
        Assert.assertEquals(cal.sum(-1, 0), -1);

    }

    @Test
    public void testSum4() {
        Assert.assertEquals(cal.sum(1, 0), 1);

    }

    @Test
    public void testSum5(int num1, int num2, int expectedResult) {
        Assert.assertEquals(cal.sum(num1, num2), expectedResult);

    }
}
