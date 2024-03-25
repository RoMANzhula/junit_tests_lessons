package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests.arguments_conversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FromStringToObjectTest {

    @ParameterizedTest
    @ValueSource(strings = "MY NAME")
    void test(User user) {
        System.out.println(user.toString());
    }
}
