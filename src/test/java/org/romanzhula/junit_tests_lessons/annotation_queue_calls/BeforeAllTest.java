package org.romanzhula.junit_tests_lessons.annotation_queue_calls;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllTest {
    public BeforeAllTest() {
        System.out.println("Constructor");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all!");
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
