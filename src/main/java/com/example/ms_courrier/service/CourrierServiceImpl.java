package com.example.ms_courrier.service;

import com.example.ms_courrier.dao.CourrierRepo;
import com.example.ms_courrier.entites.Courrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourrierServiceImpl implements CourrierService{
    @Autowired
    CourrierRepo courrierRepo;
    @Override
    public Courrier ajouter(Courrier courrier) {
        return courrierRepo.save(courrier);
    }

    @Override
    public Courrier getCourrierById(Long id) {return courrierRepo.findById(id).get();
    }

    @Override
    public List<Courrier> getAllCourrier() {
        return courrierRepo.findAll();
    }

    @Override
    public void SupprimerCourrier(Long id) {
courrierRepo.deleteById(id);
    }
}
