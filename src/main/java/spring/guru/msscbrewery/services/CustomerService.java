package spring.guru.msscbrewery.services;

import org.springframework.http.HttpStatus;
import spring.guru.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerByID(UUID id);

    CustomerDto saveCustomer(CustomerDto customerDto);

    CustomerDto updateCustomer(UUID id, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
