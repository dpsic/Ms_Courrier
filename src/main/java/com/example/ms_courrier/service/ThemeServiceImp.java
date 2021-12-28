package com.example.ms_courrier.service;

import com.example.ms_courrier.dao.ThemeRepo;
import com.example.ms_courrier.entites.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ThemeServiceImp implements ThemeService{
    @Autowired
    ThemeRepo themeRepo;
    @Override
    public Theme ajouter(Theme theme) {
        return themeRepo.save(theme);
    }

    @Override
    public Theme getThemeById(Long id) {
        return themeRepo.findById(id).get();
    }

    @Override
    public List<Theme> getAllTheme() {
        return themeRepo.findAll();
    }

    @Override
    public void SupprimerTheme(Long id) {
themeRepo.deleteById(id);
    }
}
