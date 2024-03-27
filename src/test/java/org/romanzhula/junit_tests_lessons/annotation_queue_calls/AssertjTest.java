package org.romanzhula.junit_tests_lessons.annotation_queue_calls;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertjTest {

    @Test
    void test1() {
        String str1 = "Str1";
        String str2 = "Str2";

        assertThat(str1)
                .as("can not be empty")
                .isNotEmpty()
                .as("can not be equals to str2")
                .isNotEqualTo(str2); //passed
    }

    @Test
    void test2() {
        assertThat(true).isTrue();
        assertThat(false).isFalse();
    }

    @Test
    void test3() {
        String str = "string_value";

        assertThat(str).startsWith("st").endsWith("ue");
    }

    @Test
    void test4() {
        String str1 = "str1";
        String str2 = "str2";

        assertThat(str1).isNotSameAs(str2);
    }

    @Test
    void test5() {
        List<String> list = List.of("1", "2");

        assertThat(list)
                .hasSize(2)
                .contains("1", "2")
                .contains("str2", Index.atIndex(1))
                .doesNotContain("str3");
    }

    @Test
    void test6() {
        File file = new File("test.txt");

        assertThat(file)
                .exists()
                .canRead()
                .canWrite();

    }

}
