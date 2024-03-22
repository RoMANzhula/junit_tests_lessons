package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.display_name_generation;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(value = DisplayNameGenerator.Standard.class) //default option for @DisplayNameGeneration
public class StandartTest {

    @Test
    void test() {

    }
}
