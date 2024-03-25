package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceTest {

    enum EnumSet {BOX, CIRCLE}

    @ParameterizedTest
    @EnumSource
    void test1(EnumSet value) {
        System.out.println(value);
    }

    @ParameterizedTest
    @EnumSource(mode = EnumSource.Mode.INCLUDE, names = {"BOX"})
    void test2(EnumSet value) {
        System.out.println(value);
    }

    @ParameterizedTest
    @EnumSource(mode = EnumSource.Mode.EXCLUDE, names = {"BOX"})
    void test3(EnumSet value) {
        System.out.println(value);
    }

    @ParameterizedTest
    @EnumSource(mode = EnumSource.Mode.MATCH_ALL, names = {"^.*BOX$"})
    void test4(EnumSet value) {
        System.out.println(value);
    }

}
