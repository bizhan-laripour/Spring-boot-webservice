package com.service;

import com.entity.Doctor;
import com.repository.DoctorRepository;
import com.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends GenericService<Doctor, Integer> {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorService(GenericRepository<Doctor, Integer> genericRepository) {
        super(genericRepository);
    }



}
