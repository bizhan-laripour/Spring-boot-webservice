package com.service;

import com.entity.Document;
import com.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService extends GenericService<Document , Integer> {

    @Autowired
    private DocumentRepository documentRepository;

    public DocumentService(DocumentRepository genericRepository) {
        super(genericRepository);
    }
}
