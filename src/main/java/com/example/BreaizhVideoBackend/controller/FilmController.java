package com.example.BreaizhVideoBackend.controller;


import com.example.BreaizhVideoBackend.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.BreaizhVideoBackend.repository.FilmRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    //Get all movies

    @GetMapping("/films")
    public List<Film> getAllMovies(){
        return filmRepository.findAll();
    }
}
