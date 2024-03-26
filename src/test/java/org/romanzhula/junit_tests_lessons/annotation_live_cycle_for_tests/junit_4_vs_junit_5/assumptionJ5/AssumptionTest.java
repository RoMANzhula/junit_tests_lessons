package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.assumptionJ5;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AssumptionTest {
    static final String DEV_ENV = "DEV";
    static final String PROD_ENV = "PROD";

    @BeforeAll
    static void beforeAll() {
        System.getProperty("ENV", PROD_ENV);
    }

    @Test
    void test1() {
        Assumptions.assumingThat(DEV_ENV.equals(System.getProperty("ENV")), () ->{
            System.out.println("Running on DEV ENV");
        });
    }

    private boolean returnBool(int value) {
        return value % 2 == 0;
    }

    @Test
    void test2() {
        int value = 3;

        var result = returnBool(value);

        Assumptions.assumeTrue(result);
        System.out.println("Test 2");
    }

}
