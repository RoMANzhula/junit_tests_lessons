package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class AnnotationTest {

    // WITH Junit 4
//    @Test(expected = ClassNotFoundException.class)
//    public void test() throws ClassNotFoundException {
//
//        throw new ClassNotFoundException();
//    }
//
//    @Test(timeout = 1)
//    public void test1() throws InterruptedException {
//        Thread.sleep(10); //test failed because timeout = 1
//    }


    // WITH Junit 5

    @Test
    void test() {
        Assertions.assertThrows(ClassNotFoundException.class, this::throwException);
    }

    public void throwException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    @Test
    @Timeout(1)
    void test1() throws InterruptedException {
        Thread.sleep(10000); //test failed because timeout = 1
    }
}
