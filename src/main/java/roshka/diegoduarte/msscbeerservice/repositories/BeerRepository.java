package roshka.diegoduarte.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import roshka.diegoduarte.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
