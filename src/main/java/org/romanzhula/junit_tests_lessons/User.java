package org.romanzhula.junit_tests_lessons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private String username;
    private String password;
}
