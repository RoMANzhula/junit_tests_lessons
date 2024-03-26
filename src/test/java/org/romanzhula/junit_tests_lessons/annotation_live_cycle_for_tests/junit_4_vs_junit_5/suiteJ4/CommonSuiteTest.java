package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.suiteJ4;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.testsJ4.Class1Test;
import org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.testsJ4.Class2Test;
import org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.junit_4_vs_junit_5.type.CommonTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(CommonTest.class)
@Suite.SuiteClasses({Class1Test.class, Class2Test.class})
public class CommonSuiteTest {
}
