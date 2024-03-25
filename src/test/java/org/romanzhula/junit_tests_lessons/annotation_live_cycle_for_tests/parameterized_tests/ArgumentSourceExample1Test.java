package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.parameterized_tests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

public class ArgumentSourceExample1Test {

    static class MyTestProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of("value1", "value2").map(Arguments::of);
        }
    }

    @ParameterizedTest
    @ArgumentsSource(MyTestProvider.class)
    void test1(String str) {
        System.out.println(str);
    }

}
