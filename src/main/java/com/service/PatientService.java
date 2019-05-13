package com.service;

import com.entity.Patient;
import com.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends GenericService<Patient , Integer> {


    public PatientService(PatientRepository genericRepository) {
        super(genericRepository);
    }
}
