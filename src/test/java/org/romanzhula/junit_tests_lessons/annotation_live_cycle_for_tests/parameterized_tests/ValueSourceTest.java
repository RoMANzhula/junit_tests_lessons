package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test(int arg) {
        System.out.println(arg);
    }
}
