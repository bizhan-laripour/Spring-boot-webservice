package com.service;

import com.entity.Doctor;
import com.repository.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends GenericService<Doctor , Integer>{


    public DoctorService(DoctorRepository genericRepository) {
        super(genericRepository);
    }
}
