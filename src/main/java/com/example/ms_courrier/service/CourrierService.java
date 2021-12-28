package com.example.ms_courrier.service;

import com.example.ms_courrier.entites.Courrier;

import java.util.List;

public interface CourrierService {
    Courrier ajouter(Courrier courrier);
    Courrier getCourrierById(Long id);
    List<Courrier> getAllCourrier();
    void SupprimerCourrier(Long id);
}
