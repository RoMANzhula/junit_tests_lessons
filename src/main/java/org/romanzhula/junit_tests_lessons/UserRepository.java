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

    public void addUser(String username, String password) {
        log.info(String.format("%s - creating user by username: %s, and password: %s", getClass(), username, password));

        analogDB.add(new User(username, password));
    }

    public void removeUser(String username) {
        log.info(String.format("%s - finding user by username: %s", getClass(), username));
        var userSearch = analogDB.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UserException("User not found exception from UserRepository"));

        analogDB.remove(userSearch);
    }

}
