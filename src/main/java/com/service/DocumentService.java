package com.service;

import com.dao.ReportDao;
import com.entity.Document;
import com.entity.Patient;
import com.exception.TncException;
import com.repository.DocumentRepository;
import com.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DocumentService  extends GenericService<Document , Integer> {


    @Autowired
    private ReportDao reportDao;

    @Autowired
    private DocumentRepository documentRepository;



    public DocumentService(DocumentRepository genericRepository) {
        super(genericRepository);
    }

    /**
     * get document report by stored procedure
     * @param patient
     * @return
     */
    public List<Map<String , Object>> getDocumentReport(Patient patient){
        try {
            return reportDao.documentReport(patient);
        }catch (TncException ex){
            throw new TncException("error in report");
        }
    }

    /**
     * get document report by spring data
     * @param patient
     * @return
     */
    public List<Map<String , Object>> documetReportByJpa(Patient patient){
        try{
            List<Map<String , Object>> maps = new ArrayList<Map<String, Object>>();
            List<Document> documents = documentRepository.findAllByPatient_NameAndPatient_LastName(patient.getName() , patient.getLastName());
            for(Document doc : documents){
                Map<String, Object> mp = new HashMap<String, Object>();
                mp.put("patient" , doc.getPatient().getName()+" "+doc.getPatient().getLastName());
                mp.put("doctor" , "doctor "+doc.getDoctor().getName()+" "+doc.getDoctor().getLastName());
                mp.put("clinic" , doc.getDoctor().getAddress().getCountry()+" "+doc.getDoctor().getAddress().getCity()+" "+doc.getDoctor().getAddress().getAddress());
                mp.put("doctorExperiance" , doc.getDoctor().getExpert().getTitle());
                mp.put("lastVisit" , doc.getLastVisit());
                mp.put("nextVisit" , doc.getNextVisit());
                mp.put("description" , doc.getDescription());
                maps.add(mp);
            }
            return maps;
        }catch(TncException ex){
            throw new TncException("error in report");
        }
    }

}
