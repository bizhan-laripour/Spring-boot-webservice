package com.repository;

import com.entity.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends GenericRepository<Patient, Integer> {
}
