package roshka.diegoduarte.msscbeerservice.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import roshka.diegoduarte.msscbeerservice.domain.Beer;
import roshka.diegoduarte.msscbeerservice.web.model.BeerStyleEnum;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);

    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

    Page<Beer> findAll(Pageable pageable);

    Beer findByUpc(String upc);
}
