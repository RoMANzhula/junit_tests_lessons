package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceTest {
    private final UserRepository userRepository = Mockito.mock(UserRepository.class);

    private final UserService userService = new UserService(userRepository);

    @Test
    void userExist_getUser() {
        //given
        String username = "Roman";
        String password = "123";
        when(userRepository.findUserByUserName(username)).thenReturn(new User(username, password));

        //when
        var user = userService.login(username);

        //then
        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());
    }

    @Test
    void userNotExist_throwException() {
        //given
        when(userRepository.findUserByUserName("Roman")).thenThrow(new UserException("User not found!"));

       //then
        assertThrows(UserException.class, () -> userService.login("Roman"));
    }

    @Test
    void nullParameter_throwException() {
        //given
        when(userRepository.findUserByUserName(null)).thenThrow(new UserException("User not found!"));

        //then
        assertThrows(UserException.class, () -> userService.login(null));
    }

    @Test
    void emptyParameter_throwException() {
        //given
        when(userRepository.findUserByUserName("")).thenThrow(new UserException("User not found!"));

        //then
        assertThrows(UserException.class, () -> userService.login(""));
    }

}