package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.Test;

/*
    Valid part name for test-classes-name
Test*.java
*Test.java
*Tests.java
*TestCase.java
*/

public class FirstMavenTest {

    public FirstMavenTest() {
        System.out.println("Constructor");
    }

    @Test
    void testFirst() {
        System.out.println("Testing first!");
    }

    @Test
    void testSecond() {
        System.out.println("Testing second!");
    }

}
