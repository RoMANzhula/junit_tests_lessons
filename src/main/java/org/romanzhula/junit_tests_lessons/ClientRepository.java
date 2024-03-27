package org.romanzhula.junit_tests_lessons;

import java.util.List;

public class ClientRepository {

    private final List<Client> db = List.of(new Client("Rom", "Man", "roman@net"));

    public Client clientByEmail(String email) {
        return db.stream()
                .filter(client -> email.equals(client.getEmail()))
                .findFirst()
                .orElseThrow(() -> new ClientEmailException("Client not found!"));
    }
}
