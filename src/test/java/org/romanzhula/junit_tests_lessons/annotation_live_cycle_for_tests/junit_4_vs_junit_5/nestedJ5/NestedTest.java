package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.nestedJ5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

    @Test
    void test1() {
        System.out.println("Test 1");
    }
    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @Nested
    class NestedClass {
        @BeforeEach
        void nestedBeforeEach() {
            System.out.println("Nested before each.");
        }

        @Test
        void test3() {
            System.out.println("Test 3");
        }
    }

}
