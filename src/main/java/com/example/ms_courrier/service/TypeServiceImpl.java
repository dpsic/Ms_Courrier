package com.example.ms_courrier.service;

import com.example.ms_courrier.dao.TypeRepo;
import com.example.ms_courrier.entites.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    TypeRepo typeRepo;
    @Override
    public Type ajouter(Type type) {
        return typeRepo.save(type);
    }

    @Override
    public Type getTypeById(Long id) {
        return typeRepo.findById(id).get();
    }

    @Override
    public List<Type> getAllType() {
        return typeRepo.findAll();
    }

    @Override
    public void SupprimerType(Long id) {
        typeRepo.deleteById(id);

    }
}
