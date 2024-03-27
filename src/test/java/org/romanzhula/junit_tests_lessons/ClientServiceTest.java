package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {

    ClientService clientService = new ClientService();

    @Test
    void getClientByEmail_wrongFormat_throwException() {
        clientService.getClientByEmail("some_email");
    }
}