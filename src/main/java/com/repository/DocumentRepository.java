package com.repository;

import com.entity.Document;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends GenericRepository<Document , Integer> {
}
