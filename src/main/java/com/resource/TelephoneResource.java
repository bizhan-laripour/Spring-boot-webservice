package com.resource;

import com.entity.Telephone;
import com.exception.ResponseBody;
import com.exception.TncException;
import com.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/telephone")
public class TelephoneResource {

    @Autowired
    private TelephoneService telephoneService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseBody save(@RequestBody Telephone telephone){
        try{
            return new ResponseBody(telephoneService.save(telephone));
        }catch (TncException ex){
            throw new TncException("error_in_saving");
        }
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
    public ResponseBody delete(@RequestBody Telephone telephone){
        try {
            telephoneService.delete(telephone);
            return new ResponseBody(telephone);
        }catch (Exception ex){
            throw new TncException("delete_error");
        }
    }

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public ResponseBody findAll(){
        try {
            return  new ResponseBody(telephoneService.findAll());
        }catch (TncException ex){
            throw new TncException("error_in_fetching_all");
        }
    }

    @RequestMapping(value = "/findById" , method = RequestMethod.POST)
    public ResponseBody findById(@RequestParam Integer id){
        try{
            return new ResponseBody(telephoneService.findById(id));
        }catch (TncException ex){
            throw new TncException("error_in_fetching_by_id");
        }
    }
}
