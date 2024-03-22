package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.order_test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTest {

    @Test
    @Order(3)
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    @Order(1)
    void test2() {
        System.out.println("Test 2");
    }

    @Test
    @Order(2)
    void test3() {
        System.out.println("Test 3");
    }

}
//output
//Test 2
//Test 3
//Test 1