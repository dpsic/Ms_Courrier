package com.example.ms_courrier.dao;

import com.example.ms_courrier.entites.Courrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourrierRepo extends JpaRepository<Courrier,Long> {
}
