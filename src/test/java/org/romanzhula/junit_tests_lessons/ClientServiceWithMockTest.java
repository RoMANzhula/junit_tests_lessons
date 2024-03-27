package org.romanzhula.junit_tests_lessons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ClientServiceWithMockTest {
    @Mock
    private ClientRepository clientRepository;

    private ClientService clientService;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this); //initialize Mock-objects
        clientService = new ClientService(clientRepository);
    }

    @Test
    void clientExist_getClient() {
        //given
        String clientName = "Rom";
        String clientSurname = "Man";
        String clientEmail = "roman@net";
        when(clientRepository.clientByEmail(clientEmail)).thenReturn(new Client(clientName, clientSurname, clientEmail));

        //when
        var client = clientService.getClientByEmail(clientEmail);

        //then
        assertEquals(clientEmail, client.getEmail());


    }
}
