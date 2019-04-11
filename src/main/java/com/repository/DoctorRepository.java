package com.repository;

import com.entity.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends GenericRepository<Doctor , Integer> {
}
