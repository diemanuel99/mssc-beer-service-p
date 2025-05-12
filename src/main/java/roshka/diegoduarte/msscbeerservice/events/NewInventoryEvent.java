package roshka.diegoduarte.msscbeerservice.events;

import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
