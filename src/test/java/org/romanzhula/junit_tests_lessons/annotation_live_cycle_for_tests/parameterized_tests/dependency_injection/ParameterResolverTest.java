package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests.dependency_injection;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@ExtendWith(UserParameterResolver.class) //class - who responsibility for this injection
public class ParameterResolverTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void test1(int number, User user) {
        System.out.println(number + " " + user.toString());
    }

    @ParameterizedTest
    @CsvSource({"1, value1", "2, value2"})
    void test2(int number, String str, User user) {
        System.out.println(number + " " + str + " " + user.toString());
    }

}
