package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.indicative_sentence_generation;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Test;

@IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
public class Class_Name_Test {

    @Test
    void test_name() {}

}

// output: Class Name Test -> test name