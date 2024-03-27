package org.romanzhula.junit_tests_lessons.test_ng;

import org.testng.annotations.Test;

public class RegressionTest {

    @Test(groups = "regression")
    public void test1() {
        System.out.println("Regression test");
    }
}
