package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.testsJ4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;
import org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.type.RegressionTest;

public class Class1Test {

    @Rule
    public TestName name = new TestName();

    @Category({Class1Test.class, RegressionTest.class})
    @Test
    public void commonAndRegressionTest() {
        System.out.println(this.getClass().getSimpleName() + " " + name.getMethodName());
    }

    @Category({Class1Test.class})
    @Test
    public void commonTest() {
        System.out.println(this.getClass().getSimpleName() + " " + name.getMethodName());
    }

    @Category({RegressionTest.class})
    @Test
    public void regressionTest() {
        System.out.println(this.getClass().getSimpleName() + " " + name.getMethodName());
    }

}
