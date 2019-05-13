package com.repository;


import com.entity.Document;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends GenericRepository<Document , Integer>{

     List<Document> findAllByPatient_NameAndPatient_LastName(String name , String lastName);
}
