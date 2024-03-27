package org.romanzhula.junit_tests_lessons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Client {
    private String name;
    private String surname;
    private String email;
}
