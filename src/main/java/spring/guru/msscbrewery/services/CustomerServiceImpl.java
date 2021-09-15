package spring.guru.msscbrewery.services;

import org.springframework.stereotype.Service;
import spring.guru.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("Cusotmer_1")
                .build();
    }
}
