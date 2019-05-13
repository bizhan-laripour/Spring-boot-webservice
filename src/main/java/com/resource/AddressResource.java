package com.resource;

import com.entity.Address;
import com.exception.ResponseBody;
import com.exception.TncException;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/address")
public class AddressResource {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseBody save( @RequestBody Address address){
        try{
            return new ResponseBody(addressService.save(address));
        }catch (TncException ex){
            throw new TncException("error_in_saving");
        }
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
    public ResponseBody delete(@RequestBody Address address){
        try {
            addressService.delete(address);
            return new ResponseBody(address);
        }catch (Exception ex){
            throw new TncException("delete_error");
        }
    }

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public ResponseBody findAll(){
        try {
            return  new ResponseBody(addressService.findAll());
        }catch (TncException ex){
            throw new TncException("error_in_fetching_all");
        }
    }

    @RequestMapping(value = "/findById" , method = RequestMethod.POST)
    public ResponseBody findById(@RequestParam Integer id){
        try{
            return new ResponseBody(addressService.findById(id));
        }catch (TncException ex){
            throw new TncException("error_in_fetching_by_id");
        }
    }
}
