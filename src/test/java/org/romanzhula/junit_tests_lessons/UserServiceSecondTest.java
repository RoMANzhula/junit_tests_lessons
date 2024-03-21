package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class UserServiceSecondTest {
    private static UserRepository userRepository;
    private static UserService userService;

    @BeforeAll
    static void beforeAll() {
        userRepository  = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @BeforeEach
    void beforeEach() {
        userRepository.addUser("test_name", "test_password");
    }

    @AfterEach
    void afterEach() {
        userRepository.removeUser("test_name");
    }

    @Test
    void userExistFirst() {
        //given
        String username = "test_name";
        String password = "test_password";
        when(userRepository.findUserByUserName(username)).thenReturn(new User(username, password));

        //when
        var user = userService.login(username);

        //then
        Assertions.assertEquals(username, user.getUsername());
        Assertions.assertEquals(password, user.getPassword());
    }

    @Test
    void userExistSecond() {
        //given
        String username = "test_name";
        String password = "test_password";
        when(userRepository.findUserByUserName(username)).thenReturn(new User(username, password));

        //when
        var user = userService.login(username);

        //then
        Assertions.assertEquals(username, user.getUsername());
        Assertions.assertEquals(password, user.getPassword());
    }

}
