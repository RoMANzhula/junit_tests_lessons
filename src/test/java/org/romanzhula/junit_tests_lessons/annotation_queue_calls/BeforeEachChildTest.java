package org.romanzhula.junit_tests_lessons.annotation_queue_calls;

import org.junit.jupiter.api.Test;

public class BeforeEachChildTest extends BeforeEachTest {

    @Test
    void test3() {
        System.out.println("Test 3");
    }
}

//Constructor
//Before Each!
//Test 1
//Constructor
//Before Each!
//Test 2
//Constructor
//Before Each!
//Test 3
