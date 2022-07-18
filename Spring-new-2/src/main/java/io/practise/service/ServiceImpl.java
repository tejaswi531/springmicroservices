package io.practise.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.practise.dao.Dao;
import io.practise.model.Model;

@Service
public class ServiceImpl implements ServiceI {

    @Autowired
    Dao repo;


    @Override
    public String createDetails(Model model) {
        // TODO Auto-generated method stub
        //return carDAOO.createCar(car);
        repo.insert(model);
        return ("Added with id"+ model.getorderId());
    }

    @Override
    public String updateDetails(String id, Model model) {
        // TODO Auto-generated method stub
        repo.save(model);
        return("Updated with id"+id);

    }

    @Override
    public String deleteDetails(String id) {
        // TODO Auto-generated method stub
        repo.deleteById(id);
        return("Delete with carNo"+id);

    }

    @Override
    public Collection<Model> getDetails() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }


}