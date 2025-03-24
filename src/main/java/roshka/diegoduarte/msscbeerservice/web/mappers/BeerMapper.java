package roshka.diegoduarte.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import roshka.diegoduarte.msscbeerservice.domain.Beer;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    @Mapping(target = "quantityOnHand", ignore = true)
    BeerDto beerToBeerDto (Beer beer);

    @Mapping(target = "quantityToBrew", ignore = true)
    @Mapping(target = "minOnHand", ignore = true)
    Beer beerDtoToBeer (BeerDto dto);
}
