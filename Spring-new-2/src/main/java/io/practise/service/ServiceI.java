package io.practise.service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import io.practise.model.Model;

@Component
public interface ServiceI {

    Collection<Model> getDetails();

    String createDetails(Model model);

    String  updateDetails(String id, Model model);

    String  deleteDetails(String id);


}
