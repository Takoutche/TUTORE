package com.michelle.gesbiblio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.michelle.gesbiblio.entity.Ouvrage;
import org.springframework.stereotype.Repository;
public interface OuvrageDao extends JpaRepository<Ouvrage,Integer> {
    Ouvrage findByNom(String nom);
}
