package com.repository;

import com.entity.Expert;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertRepository extends GenericRepository<Expert , Integer> {
}
