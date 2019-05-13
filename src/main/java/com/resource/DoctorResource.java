package com.resource;

import com.entity.Doctor;
import com.exception.ResponseBody;
import com.exception.TncException;
import com.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorResource {


    @Autowired
    private DoctorService doctorService;


    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseBody save(@RequestBody Doctor doctor) throws Exception {
        try {
            return new ResponseBody(doctorService.save(doctor));
        }catch (TncException ex){
            throw new TncException("hey");
        }
    }



    @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
    public Doctor delete(@RequestBody Doctor doctor) throws Exception {
        try {
            doctorService.delete(doctor);
            return doctor;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }


    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public List<Doctor> findAll() throws Exception {
        try{
            return doctorService.findAll();
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @RequestMapping(value = "findById" , method = RequestMethod.POST)
    public Doctor findById(Integer id) throws Exception {
        try{
            return  doctorService.findById(id);
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
