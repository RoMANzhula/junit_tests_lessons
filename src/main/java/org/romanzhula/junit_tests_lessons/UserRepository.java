package org.romanzhula.junit_tests_lessons;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class UserRepository {

    private final List<User> analogDB = List.of(new User("Roman", "123"));

    public User findUserByUserName(String username) {
        log.info(String.format("%s - finding user by username: %s", getClass(), username));

        return analogDB.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UserException("User not found exception from UserRepository"));
    }
}
