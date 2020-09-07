package com.stuart.graphqlserver.model.bank;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Builder
@Value
public class Client {
    private UUID id;
    private String firstName;
    private List<String> middleNames;
    private String lastName;

}
