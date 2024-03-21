package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachTest {
    public BeforeEachTest() {
        System.out.println("Constructor");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each!");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
    }

}
