package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodSourceTest {
    static Stream<String> stringProvider() {
        return Stream.of("Apple", "Banana", "Mango");
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void test1(String elements) {
        System.out.println(elements);
    }

    static IntStream primitiveProvider() {
        return IntStream.range(0, 20).skip(10);
    }

    @ParameterizedTest
    @MethodSource("primitiveProvider")
    void test2(int arg) {
        System.out.println(arg);
    }

    static Stream<Arguments> stringIntAndList() {
        return Stream.of(
                Arguments.arguments("apple", 1, Arrays.asList("a", "b"))
        );
    }

    @ParameterizedTest
    @MethodSource("stringIntAndList")
    void test3(String str, int num, List<String> list) {
        System.out.println(str + " " + num + " " + list.toString());
    }

    @ParameterizedTest
    @MethodSource("org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests.ClassForTestingMethodSource#stringStream")
    void test4(String str) {
        System.out.println(str);
    }

}
