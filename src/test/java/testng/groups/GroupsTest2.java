package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest2 {

    @Test(groups = {"reg"})
    public void testGT2_001() {
        System.out.println("GT2_001");
    }

    @Test(groups = {"smoke"})
    public void testGT2_002() {
        System.out.println("GT2_002");
    }

    @Test(groups = {"reg"})
    public void testGT2_003() {
        System.out.println("GT2_003");
    }

}
