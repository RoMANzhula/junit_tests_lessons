package org.romanzhula.junit_tests_lessons.test_ng;


import org.testng.annotations.Test;

public class CommonTest {

    @Test(groups = "common")
    public void test1() {
        System.out.println("Common test");
    }
}
