package roshka.diegoduarte.msscbeerservice.web.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import roshka.diegoduarte.msscbeerservice.domain.Beer;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;
import roshka.diegoduarte.msscbeerservice.web.service.inventory.BeerInventoryService;

public abstract class BeerMapperDecorator implements BeerMapper {
    private BeerInventoryService beerInventoryService;
    private BeerMapper mapper;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @Autowired
    public void setMapper(BeerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        BeerDto dto = mapper.beerToBeerDto(beer);
        dto.setQuantityOnHand(beerInventoryService.getOnhandInventory(beer.getId()));
        return dto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        return mapper.beerDtoToBeer(beerDto);
    }
}

