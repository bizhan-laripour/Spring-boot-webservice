package com.resource;

import com.entity.Document;
import com.entity.Patient;
import com.exception.ResponseBody;
import com.exception.TncException;
import com.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/document")
public class DocumentResource {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseBody save(@RequestBody Document document){
        try{
            return new ResponseBody(documentService.save(document));
        }catch (TncException ex){
            throw new TncException("error_in_saving");
        }
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
    public ResponseBody delete(@RequestBody Document document){
        try {
            documentService.delete(document);
            return new ResponseBody(document);
        }catch (Exception ex){
            throw new TncException("delete_error");
        }
    }

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public ResponseBody findAll(){
        try {
            return  new ResponseBody(documentService.findAll());
        }catch (TncException ex){
            throw new TncException("error_in_fetching_all");
        }
    }

    @RequestMapping(value = "/findById" , method = RequestMethod.POST)
    public ResponseBody findById(@RequestParam Integer id){
        try{
            return new ResponseBody(documentService.findById(id));
        }catch (TncException ex){
            throw new TncException("error_in_fetching_by_id");
        }
    }

    @RequestMapping(value = "/getDocumentReport" , method = RequestMethod.POST)
    public ResponseBody getDocumentReport(@RequestBody Patient patient){
        try{
            return new ResponseBody(documentService.getDocumentReport(patient));
        }catch(TncException ex){
            throw new TncException(ex.getMessage());
        }
    }

    @RequestMapping(value = "/getDocumentReportByJpa" , method = RequestMethod.POST)
    public ResponseBody getDocumentReportByJpa(@RequestBody Patient patient){
        try {
            return  new ResponseBody(documentService.documetReportByJpa(patient));
        }catch (TncException ex){
            throw  new TncException(ex.getMessage());
        }
    }
}
