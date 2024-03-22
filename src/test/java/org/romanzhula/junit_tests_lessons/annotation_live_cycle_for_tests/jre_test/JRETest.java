package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.jre_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class JRETest {

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void java8() {
        System.out.println("JAVA_8");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void java21() {
        System.out.println("JAVA_21");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_21})
    void java8And21() {
        System.out.println("JAVA_8 and JAVA_21");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_21)
    void disabledJava21() {
        System.out.println("JAVA_21");
    }

    @Test
    @DisabledOnJre(value = JRE.JAVA_21, disabledReason = "BUG_REPORT_NUM")
    void disabledWithCommentJava21() {
        System.out.println("JAVA_21");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_21})
    void disabledJava8And21() {
        System.out.println("JAVA_8 and JAVA_21");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13)
    void fromJava13toLastVersion() {
        System.out.println("From JAVA_13 TO last version");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max = JRE.JAVA_19)
    void fromJava13toJava19() {
        System.out.println("From JAVA_13 TO JAVA_19");
    }

    @Test
    @DisabledForJreRange(max = JRE.JAVA_19)
    void disabledToJava19() {
        System.out.println("Disabled TO JAVA_19");
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_19)
    void disabledFromJava19() {
        System.out.println("Disabled FROM JAVA_19");
    }

}
