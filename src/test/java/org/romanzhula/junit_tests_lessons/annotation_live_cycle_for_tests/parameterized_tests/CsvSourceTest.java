package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({"Box, 1", "'Big square', 2"})
    void test1(String figure, int number) {
        System.out.println(figure + " - " + number);
    }

    @ParameterizedTest
    @CsvSource(value = {"Box; 1", "'Big square'; 2"}, delimiter = ';')
    void test2(String figure, int number) {
        System.out.println(figure + " - " + number);
    }

    @ParameterizedTest
    @CsvSource(value = {"NAME; VALUE", "Box; 1", "'Big square'; 2"}, delimiter = ';', useHeadersInDisplayName = true)
    void test3(String figure, int number) {
        System.out.println(figure + " - " + number);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-csv-file.csv", numLinesToSkip = 1)
    void test4(String country, int reference) {
        System.out.println(country + " - " + reference);
    }

}
