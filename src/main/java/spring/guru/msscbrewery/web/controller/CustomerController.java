package spring.guru.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.guru.msscbrewery.services.CustomerService;
import spring.guru.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId")UUID id) {
        return new ResponseEntity<>(customerService.getCustomerByID(id), HttpStatus.OK);
    }
}
