package co.simplon.breizhvideo.controller;


import co.simplon.breizhvideo.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.breizhvideo.repository.FilmRepository;

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
