package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.assertionJ5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.util.Arrays.asList;

public class AssertionsTest {

    static final String obj1 = "Roman";
    static final String clonedFromObj1 = obj1;
    static final String obj2 = "Roman.com";

    @Test
    void test1() {
        Assertions.assertNotSame(obj1, obj2); //passed because this is different objects
        Assertions.assertSame(obj1, clonedFromObj1); //passed because this is two links to same object
    }

    private void method() throws InterruptedException {
        System.out.println("Something doing...");
        Thread.sleep(1500);
    }

    @Test
    void test2() {
        Assertions.assertTimeout(Duration.ofSeconds(1), this::method); //failed because we sleep more than 1 second
    }

    @Test
    void test3() {
        Iterable<String> list1 = asList("1", "2", "3");
        Iterable<String> list2 = asList("1", "2", "3");

        Assertions.assertIterableEquals(list1, list2); //passed
    }

}
