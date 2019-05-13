package com.resource;

import com.entity.Address;
import com.entity.Expert;
import com.exception.ResponseBody;
import com.exception.TncException;
import com.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/expert")
public class ExpertResource {

    @Autowired
    private ExpertService expertService;

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseBody save(@RequestBody Expert expert){
        try{
            return new ResponseBody(expertService.save(expert));
        }catch (TncException ex){
            throw new TncException("error_in_saving");
        }
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.DELETE)
    public ResponseBody delete(@RequestBody Expert expert){
        try {
            expertService.delete(expert);
            return new ResponseBody(expert);
        }catch (Exception ex){
            throw new TncException("delete_error");
        }
    }

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public ResponseBody findAll(){
        try {
            return  new ResponseBody(expertService.findAll());
        }catch (TncException ex){
            throw new TncException("error_in_fetching_all");
        }
    }

    @RequestMapping(value = "/findById" , method = RequestMethod.POST)
    public ResponseBody findById(@RequestParam Integer id){
        try{
            return new ResponseBody(expertService.findById(id));
        }catch (TncException ex){
            throw new TncException("error_in_fetching_by_id");
        }
    }
}
