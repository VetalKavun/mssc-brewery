package spring.guru.msscbrewery.services;

import org.springframework.stereotype.Service;
import spring.guru.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .beerName("Galaxy Cat")
                .beerType("Pale Ale")
                .build();
    }
}
