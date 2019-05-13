package com.service;

import com.entity.Expert;
import com.repository.ExpertRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpertService extends GenericService<Expert , Integer> {

    public ExpertService(ExpertRepository genericRepository) {
        super(genericRepository);
    }
}
