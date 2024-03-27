package org.romanzhula.junit_tests_lessons;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import static java.util.Objects.isNull;


public class ClientService {
    private final ClientRepository clientRepository = new ClientRepository();

    public ClientService() {
    }

    public ClientService(ClientRepository clientRepository) {
    }

    public Client getClientByEmail(String email) {
        if (isNull(email)) {
            throw new ClientEmailException("Can't be NULL!");
        }

        if (!email.matches("^(.+)@(.+)$")) {
            throw new ClientEmailException("Not valid email format!");
        }

        return clientRepository.clientByEmail(email);
    }
}
