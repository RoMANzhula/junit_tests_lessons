package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.os_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OsTest {

    @Test
    @DisabledOnOs(OS.MAC)
    void disabledOnMac() {
        System.out.println("Disabled on MAC");
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void disabledOnWindows() {
        System.out.println("Disabled on WINDOWS");
    }

    @Test
    @EnabledOnOs(value = OS.MAC, architectures = "x86_65")
    void enabledOnMacWithArch() {
        System.out.println("Enabled on MAC with architecture x86_65");
    }

    @Test
    @EnabledOnOs(architectures = "x64")
    void enabledWithArch() {
        System.out.println("Enabled with architecture x64");
    }


    public static void main(String[] args) {
        //get current OS and architecture
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
    }


}
