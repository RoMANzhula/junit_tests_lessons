package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

public class NullAndEmptySourceTest {

    @ParameterizedTest
    @NullSource
    void test1(String value) {

        Assertions.assertNull(value);
    }

    @ParameterizedTest
    @EmptySource
    void test2(String value) {

        Assertions.assertEquals("", value);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void test3(String value) {

        System.out.println("Value " + value);
    }



}
