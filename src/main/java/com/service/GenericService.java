package com.service;

import com.repository.GenericRepository;


import java.util.List;



public class GenericService<T, K> {


    private GenericRepository<T , K> genericRepository;

    public GenericService(GenericRepository genericRepository){
        this.genericRepository = genericRepository;
    }


    public List<T> findAll(){
       return genericRepository.findAll();
    }

    public T findById(K id){
        return genericRepository.getOne(id);
    }

    public T  save(T t){
       return genericRepository.save(t);
    }

    public void  delete(T t){
        genericRepository.delete(t);
    }




}
