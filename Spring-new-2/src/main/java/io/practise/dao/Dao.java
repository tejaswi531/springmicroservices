package io.practise.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.practise.model.Model;

@Repository
@Primary
public interface Dao extends MongoRepository<Model, String>{

    void Insert(io.practise.model.Model model);

    void Save(io.practise.model.Model model);

}