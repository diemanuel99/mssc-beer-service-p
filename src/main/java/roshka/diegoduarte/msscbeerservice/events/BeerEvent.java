package roshka.diegoduarte.msscbeerservice.events;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;

import java.io.Serial;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {
    @Serial
    private static final long serialVersionUID = -8219080865703694661L;

    private final BeerDto beerDto;
}
