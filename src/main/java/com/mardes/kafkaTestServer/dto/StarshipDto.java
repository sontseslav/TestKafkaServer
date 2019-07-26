package com.mardes.kafkaTestServer.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StarshipDto extends AbstractDto {

    private String name;
    private String model;
}
