package com.example.ms_courrier.controller;

import com.example.ms_courrier.entites.Theme;
import com.example.ms_courrier.entites.Type;
import com.example.ms_courrier.service.ThemeService;
import com.example.ms_courrier.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class TypeController {
    @Autowired
    TypeService typeService;

    @PostMapping("/Types")
    public Type saveType(@RequestBody Type type){
        return typeService.ajouter(type);
    }

    @GetMapping(path = "/Types/{id}")
    public Type getType(@PathVariable(name = "id") Long id){
        return typeService.getTypeById(id);
    }

    @GetMapping(path = "/Types")
    public List<Type> allType(){
        return typeService.getAllType();
    }

    @DeleteMapping(path = "/Types/{id}")
    public void deleteType(@PathVariable(name = "id") Long id){
        typeService.SupprimerType(id);
    }
}
