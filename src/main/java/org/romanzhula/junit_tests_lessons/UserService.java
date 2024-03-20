package org.romanzhula.junit_tests_lessons;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User login(String username) {
        return  userRepository.findUserByUserName(username);
    }

}
