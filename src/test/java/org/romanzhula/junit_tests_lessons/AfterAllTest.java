package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.Test;

public class AfterAllTest {

    public AfterAllTest() {
        System.out.println("Constructor");
    }

    @org.junit.jupiter.api.AfterAll
    static void afterAll() {
        System.out.println("After all!");
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
