package spring.guru.msscbrewery.services;

import spring.guru.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto saveBeerDto(BeerDto beerDto);
    void updateBeer(UUID beerId, BeerDto beerDto);
}
