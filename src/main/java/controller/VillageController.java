package controller;

import model.Village;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.VillageRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class VillageController {

    @Autowired
    private VillageRepository villageRepository;

    //Get all villages

    @GetMapping("/villages")
    public List<Village> getAllMovies(){
        return villageRepository.findAll();
    }
}
