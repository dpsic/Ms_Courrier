package com.example.ms_courrier.controller;

import com.example.ms_courrier.entites.Courrier;
import com.example.ms_courrier.entites.Theme;
import com.example.ms_courrier.service.CourrierService;
import com.example.ms_courrier.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class ThemeController {
    @Autowired
    ThemeService themeService;

    @PostMapping("/Themes")
    public Theme saveTheme(@RequestBody Theme theme){
        return themeService.ajouter(theme);
    }

    @GetMapping(path = "/Themes/{id}")
    public Theme getTheme(@PathVariable(name = "id") Long id){
        return themeService.getThemeById(id);
    }

    @GetMapping(path = "/Themes")
    public List<Theme> allTheme(){
        return themeService.getAllTheme();
    }

    @DeleteMapping(path = "/Themes/{id}")
    public void deleteTheme(@PathVariable(name = "id") Long id){
       themeService.SupprimerTheme(id);
    }
}
