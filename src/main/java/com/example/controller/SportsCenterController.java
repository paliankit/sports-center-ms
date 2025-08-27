package com.example.controller;


import com.example.service.F1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/v1/sports")
public class SportsCenterController {

    @Autowired
    private F1Service f1Service;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("drivers", f1Service.getDriverStandings());
        model.addAttribute("constructors", f1Service.getConstructorStandings());
        return "standings";
    }

    @Scheduled(fixedRate = 30 * 1000)
    public void refreshCache(){
        System.out.println("Refreshing caches...");
        clearCaches();  //clear caches
        f1Service.getDriverStandings();   //load data again in the caches
        f1Service.getConstructorStandings();
    }

    @CacheEvict(value={"driverStandings","constructorStandings"},allEntries = true)
    public void clearCaches(){
        // this will clear the caches
    }

}
