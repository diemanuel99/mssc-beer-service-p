package roshka.diegoduarte.msscbeerservice.web.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;
import roshka.diegoduarte.msscbeerservice.web.model.BeerPagedList;
import roshka.diegoduarte.msscbeerservice.web.model.BeerStyleEnum;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);
    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);
}
