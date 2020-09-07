package com.stuart.graphqlserver.model.bank;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class BankAccount {

    private UUID id;
    private Client client;
    private Currency currency;
}
