package com.mardes.kafkaTestServer.service;

import com.mardes.kafkaTestServer.dto.StarshipDto;

public interface StarshipService {

    StarshipDto save(StarshipDto dto);

    void send (StarshipDto dto);

    void consume(StarshipDto dto);
}
