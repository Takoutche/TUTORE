package com.michelle.gesbiblio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categorie")

public class Categorie implements Serializable {
    @Id
    @Column(name ="id_cat")
    private Integer id_cat;

    @Column(name ="nom")
    private String nom;

    @Column(name ="libelle")
    private String libelle;

    @Column(name ="quantite")
    private Integer quantite;

    @ManyToOne
    @JoinColumn (name = "id_ouvrage")
    private Ouvrage ouvrage;

}


