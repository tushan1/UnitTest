package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest2 {

    @Test
    public void testAssertEquals() {
        String actualValue = "Hello TestNG!";
        Assert.assertEquals(actualValue,"Hello TestNG!","String Mismatch:");
    }

    @Test
    public void testAssertNotEquals() {
        String actualValue = "Hello TestNG!";
        Assert.assertNotEquals(actualValue,"Hello TestNG!","String match:");
    }

    @Test
    public void testAssertTrue() {
        boolean actualValue = false;
        Assert.assertTrue(actualValue,"Failed : Boolean Mismatch");
    }

    @Test
    public void testAssertFalse() {
        boolean actualValue = false;
        Assert.assertFalse(actualValue,"Failed : Boolean Mismatch");
    }
}
