package com.resource;

import com.entity.Document;
import com.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/document")
@RestController
public class DocumentResource {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public Document save(@RequestBody Document document){
        return documentService.save(document);
    }
}
