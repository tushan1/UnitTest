package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest3 {

    @Test(groups = {"reg"})
    public void testGT3_001() {
        System.out.println("GT3_001");
    }
    @Test(groups = {"smoke","reg"})
    public void testGT3_002() {
        System.out.println("GT3_002");
    }
    @Test(groups = {"smoke"})
    public void testGT3_003() {
        System.out.println("GT3_003");
    }
    @Test
    public void testGT3_004() {
        System.out.println("GT3_004");
    }

}
