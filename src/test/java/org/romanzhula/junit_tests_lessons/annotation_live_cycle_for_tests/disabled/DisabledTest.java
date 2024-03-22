package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {

    @Disabled(value = "BUG_REPORT_NUM")
    @Test
    void test1() {
        System.out.println("Test 1");
    }
    @Test
    void test2() {
        System.out.println("Test 2");
    }
}
