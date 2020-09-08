package com.stuart.graphqlserver.resolver;

import com.stuart.graphqlserver.model.bank.BankAccount;
import com.stuart.graphqlserver.model.bank.Client;
import com.stuart.graphqlserver.model.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.UUID;

@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {

        log.info("Creating bank account with id {})", id);

        // Recursion test

        Client client1 = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Stuart")
                .middleNames(Collections.singletonList("The Beast"))
                .lastName("Burnside")
                .build();
        Client client2 = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Robert")
                .middleNames(Collections.singletonList("Supergoose"))
                .lastName("Mongoose")
                .build();

        client1.setClient(client2);
        client2.setClient(client1);

        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .client(client1)
                .build();
    }
}
