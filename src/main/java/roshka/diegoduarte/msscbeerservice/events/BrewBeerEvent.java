package roshka.diegoduarte.msscbeerservice.events;

import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{
    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
