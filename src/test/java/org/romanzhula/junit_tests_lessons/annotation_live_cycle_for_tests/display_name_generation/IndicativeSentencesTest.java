package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.display_name_generation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(value = DisplayNameGenerator.IndicativeSentences.class)
public class IndicativeSentencesTest {

    @Test
    void test() {
        System.out.println("Testing from here");
    }

    @DisplayName(value = "CUSTOM_TEST_WITH_HIGHER_PRIORITY") //test will have this name (not IndicativeSentencesTest)
    @Test
    void testSecond() {

    }
}
