package roshka.diegoduarte.msscbeerservice.repositories;

import org.springframework.data.repository.CrudRepository;
import roshka.diegoduarte.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
