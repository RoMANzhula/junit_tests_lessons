package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.custom_condition_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

import java.time.LocalDate;

public class CustomConditionTest {
    boolean customConditionMethod() {
        return (LocalDate.now().getDayOfMonth() % 2) == 0;
    }

    @Test
    @EnabledIf("customConditionMethod")
    void enabledTest() {
        System.out.println("If today is an even day of the month."); //22.03.2024
    }

    @Test
    @DisabledIf("customConditionMethod")
    void disabledTest() {
        System.out.println("If today is an odd day of the month.");
    }

}
