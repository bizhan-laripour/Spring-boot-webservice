package com.repository;

import com.entity.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends GenericRepository<Address , Integer> {
}
