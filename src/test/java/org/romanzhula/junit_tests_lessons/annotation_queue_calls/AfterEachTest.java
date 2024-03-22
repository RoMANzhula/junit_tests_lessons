package org.romanzhula.junit_tests_lessons.annotation_queue_calls;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AfterEachTest {
    public AfterEachTest() {
        System.out.println("Constructor");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each!");
    }

    @Test
    void test1() {
        System.out.println("Test1");
    }
    @Test
    void test2() {
        System.out.println("Test2");
    }

}
//Constructor
//Test1
//After Each!
//Constructor
//Test2
//After Each!