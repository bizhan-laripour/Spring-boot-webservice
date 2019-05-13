package com.dao;

import com.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ReportDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Map<String , Object>> documentReport(Patient patient){

        StringBuilder builder = new StringBuilder();
        builder.append("EXECUTE stp_medicalDocumentReport ");
        builder.append("@patientName="+patient.getName()+",");
        builder.append("@patientLastName="+patient.getLastName());
        return jdbcTemplate.queryForList(builder.toString());
    }
}
