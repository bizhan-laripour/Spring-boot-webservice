package com.service;

import com.entity.Document;
import com.repository.DocumentRepository;
import com.repository.GenericRepository;
import org.springframework.stereotype.Service;

@Service
public class DocumentService  extends GenericService<Document , Integer> {

    public DocumentService(DocumentRepository genericRepository) {
        super(genericRepository);
    }
}
