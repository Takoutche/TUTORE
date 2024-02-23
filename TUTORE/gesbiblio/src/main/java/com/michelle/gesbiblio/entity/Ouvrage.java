package com.michelle.gesbiblio.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ouvrage")
public class Ouvrage implements Serializable {
    @Id
    @Column(name ="id_ouvrage")
    private Integer id_ouvrage;

    @Column(name ="nom")
    private String nom;

    @Column(name ="auteur")
    private String auteur;

    @Column(name ="quantite")
    private Integer quantite;

    @Column(name ="description")
    private String description;

    @Column(name ="date_publication")
    private Date date_publication;

    @OneToMany(mappedBy="ouvrage")
    private List <Categorie> categories;

    @OneToMany (mappedBy = "ouvrage")
    private List<Type_document>Type_documents;


}
