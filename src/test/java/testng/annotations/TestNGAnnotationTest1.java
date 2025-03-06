package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest1 {
    public static void main(String[] args) {
        System.out.println("Print 1");
        TestNGAnnotationTest1 x = new TestNGAnnotationTest1();
        x.print1();
    }

    public void print1() {
        System.out.println("Print 2");
    }

    @Test
    public void print2() {
        System.out.println("Print 3");
    }

}
