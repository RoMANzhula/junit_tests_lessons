package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.display_name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CUSTOM CLASS NAME") //one parameter value
public class DisplayNameTest {

    @DisplayName("CUSTOM TEST NAME")
    @Test
    void test() {
        System.out.println("Testing");
    }
}
