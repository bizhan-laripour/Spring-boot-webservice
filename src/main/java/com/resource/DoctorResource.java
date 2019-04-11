package com.resource;

import com.entity.Doctor;
import com.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Doctor")
public class DoctorResource {


    @Autowired
    private  DoctorService doctorService;


    @RequestMapping(path = "/save" , method = RequestMethod.POST)
    public Doctor save( @RequestBody Doctor doctor){
       return doctorService.add(doctor);
    }
}
