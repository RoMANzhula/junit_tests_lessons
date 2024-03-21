package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllChildTest extends BeforeAllTest {
    @BeforeAll
    static void beforeAllChild() {
        System.out.println("Before all Child!");
    }

    @Test
    void test3() {
        System.out.println("Test 3");
    }
}
