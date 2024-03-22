package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.display_name_generation;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(value = DisplayNameGenerator.Simple.class)
public class SimpleTest {

    @Test
    void test() { //we'll have test's name without () - "test"

    }
}
