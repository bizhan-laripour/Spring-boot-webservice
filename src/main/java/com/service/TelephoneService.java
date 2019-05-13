package com.service;

import com.entity.Telephone;
import com.repository.TelephoneRepository;
import org.springframework.stereotype.Service;

@Service
public class TelephoneService extends GenericService<Telephone , Integer> {


    public TelephoneService(TelephoneRepository genericRepository) {
        super(genericRepository);
    }
}
