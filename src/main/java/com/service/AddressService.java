package com.service;

import com.entity.Address;
import com.repository.AddressRepository;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends GenericService<Address , Integer> {

    public AddressService(AddressRepository genericRepository) {
        super(genericRepository);
    }
}
