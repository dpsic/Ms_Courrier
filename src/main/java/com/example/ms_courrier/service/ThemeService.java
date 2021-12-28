package com.example.ms_courrier.service;

import com.example.ms_courrier.entites.Courrier;
import com.example.ms_courrier.entites.Theme;

import java.util.List;

public interface ThemeService {
    Theme ajouter(Theme theme);
    Theme getThemeById(Long id);
    List<Theme> getAllTheme();
    void SupprimerTheme(Long id);

}
