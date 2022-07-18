package io.practise.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.practise.model.Model;
import io.practise.model.Movie;
import io.practise.service.ServiceI;

@RestController
public class Controller {

    @Autowired
    ServiceI getS;

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/admin/carinfo")
    public Collection<Model> getDetails(){
        return getS.getDetails();
    }
    @RequestMapping(method=RequestMethod.POST,value="/admin/addcar")
    public void addTopic(@RequestBody Model model) {
        getS.createDetails(model);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/admin/info/{id}")
    public void updateTopic(@RequestBody Model model,@PathVariable String id) {
        getS.updateDetails(id, model);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/admin/info/{id}")
    public void deleteTopic(@PathVariable String  id) {
        getS.deleteDetails(id);
    }

    //movie info
        @GetMapping("/{movieId}")
        public Movie getMovieInfo(@PathVariable("movieId") String movieId) {

            String url="http://Movie/{movieId}";
            Movie movie = restTemplate.getForObject(url + movieId, Movie.class);
            return movie;

        }

}