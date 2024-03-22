package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.time_out_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeOutTest {

    @Test
    @Timeout(1)
    void failedTest() throws InterruptedException {
        Thread.sleep(1500);
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void test() {
        System.out.println("After 2 second"); //success test
    }

}
