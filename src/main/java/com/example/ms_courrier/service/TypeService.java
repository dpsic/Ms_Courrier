package com.example.ms_courrier.service;

import com.example.ms_courrier.entites.Theme;
import com.example.ms_courrier.entites.Type;

import java.util.List;

public interface TypeService {
    Type ajouter(Type type);
    Type getTypeById(Long id);
    List<Type> getAllType();
    void SupprimerType(Long id);
}
