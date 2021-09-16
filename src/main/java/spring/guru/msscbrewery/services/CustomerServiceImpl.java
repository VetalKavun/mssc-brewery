package spring.guru.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.guru.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("Cusotmer_1")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Customer_name")
                .build();
    }

    @Override
    public CustomerDto updateCustomer(UUID id, CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(id)
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("deleting customer entity...");
    }


}
