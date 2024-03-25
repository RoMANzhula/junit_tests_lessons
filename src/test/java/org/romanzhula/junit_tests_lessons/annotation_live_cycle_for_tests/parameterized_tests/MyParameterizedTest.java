package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyParameterizedTest {

    @DisplayName("CUSTOM")
    @ParameterizedTest(name = "{displayName} \n {index} \n [{index}] {argumentsWithNames}")
    @CsvSource({"Box, 1", "'Big square', 2"})
    void test(String figure, int number) {
        System.out.println(figure + " - " + number);
    }
}
