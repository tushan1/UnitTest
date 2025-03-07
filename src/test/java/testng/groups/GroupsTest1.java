package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest1 {

    @Test(groups = {"smoke","reg"})
    public void testGT1_001() {
        System.out.println("GT1_001");
    }

    @Test(groups = {"reg"})
    public void testGT1_002() {
        System.out.println("GT1_002");
    }

    @Test(groups = {"smoke","reg"})
    public void testGT1_003() {
        System.out.println("GT1_003");
    }

    @Test
    public void testGT1_004() {
        System.out.println("GT1_004");
    }

    @Test(groups = {"smoke"})
    public void testGT1_005() {
        System.out.println("GT1_005");
    }

}
