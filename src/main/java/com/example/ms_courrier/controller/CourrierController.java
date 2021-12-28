package com.example.ms_courrier.controller;

import com.example.ms_courrier.entites.Courrier;
import com.example.ms_courrier.service.CourrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class CourrierController {
    @Autowired
    CourrierService courrierService;

    @PostMapping("/courriers")
    public Courrier saveCourrier(@RequestBody Courrier courrier){
        return courrierService.ajouter(courrier);
    }

    @GetMapping(path = "/Courriers/{id}")
    public Courrier getCourrier(@PathVariable(name = "id") Long id){
        return courrierService.getCourrierById(id);
    }

    @GetMapping(path = "/Courriers")
    public List<Courrier> allCourrier(){
        return courrierService.getAllCourrier();
    }

    @DeleteMapping(path = "/sites/{id}")
    public void deleteCourrier(@PathVariable(name = "id") Long id){
        courrierService.SupprimerCourrier(id);
    }
}
