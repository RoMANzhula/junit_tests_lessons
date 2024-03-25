package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import java.util.stream.Stream;

public class ClassForTestingMethodSource {
    static Stream<String> stringStream() {
        return Stream.of(".", "00", "000");
    }
}
