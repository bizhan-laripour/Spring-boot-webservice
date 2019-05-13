package com.repository;

import com.entity.Telephone;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository extends GenericRepository<Telephone , Integer> {
}
