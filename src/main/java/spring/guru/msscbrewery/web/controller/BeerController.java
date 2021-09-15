package spring.guru.msscbrewery.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerRequest;
import spring.guru.msscbrewery.services.BeerService;
import spring.guru.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(BeerDto beerDto) {
        BeerDto savedBeerDto = beerService.saveBeerDto(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "api/v1/beer/" + savedBeerDto.getId().toString());
        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }
}
