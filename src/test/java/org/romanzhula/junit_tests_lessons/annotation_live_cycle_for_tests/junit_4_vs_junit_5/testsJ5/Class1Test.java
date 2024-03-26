package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.testsJ5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class Class1Test {
    private TestInfo testInfo;

    @BeforeEach
    void beforeEach(TestInfo testInfo) {
        this.testInfo = testInfo;
    }

    @Tag(value = "common")
    @Tag(value = "regression")
    @Test
    void commonAndRegressionTest() {
        System.out.println(this.getClass().getSimpleName() + " " + testInfo.getDisplayName());
    }

    @Tag(value = "common")
    @Test
    void commonTest() {
        System.out.println(this.getClass().getSimpleName() + " " + testInfo.getDisplayName());
    }

    @Tag(value = "regression")
    @Test
    void regressionTest() {
        System.out.println(this.getClass().getSimpleName() + " " + testInfo.getDisplayName());
    }

}
