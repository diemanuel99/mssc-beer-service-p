package roshka.diegoduarte.msscbeerservice.web.service;

import org.springframework.stereotype.Service;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
