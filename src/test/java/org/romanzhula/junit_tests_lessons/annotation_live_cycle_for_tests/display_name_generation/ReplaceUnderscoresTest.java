package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.display_name_generation;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class) //name our tests will be without underscores
public class ReplaceUnderscoresTest {

    @Test
    void replace_underscore() { //we'll have "replace underscore"

    }

}
