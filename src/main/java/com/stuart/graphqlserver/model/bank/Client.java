package com.stuart.graphqlserver.model.bank;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Builder
//@Value
@Setter
public class Client {
    private UUID id;
    private String firstName;
    private List<String> middleNames;
    private String lastName;
    private Client client;

}
