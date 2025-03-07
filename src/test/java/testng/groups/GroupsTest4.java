package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest4 {

    @Test(groups = {"smoke","reg"})
    public void testGT4_001() {
        System.out.println("GT4_001");
    }
    @Test(groups = {"reg"})
    public void testGT4_002() {
        System.out.println("GT4_002");
    }
    @Test
    public void testGT4_003() {
        System.out.println("GT4_003");
    }
    @Test(groups = {"reg"})
    public void testGT4_004() {
        System.out.println("GT4_004");
    }
    @Test(groups = "smoke")
    public void testGT4_005() {
        System.out.println("GT4_005");
    }

}
