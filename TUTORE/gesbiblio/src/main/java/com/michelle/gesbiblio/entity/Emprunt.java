package com.michelle.gesbiblio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="emprunt")
public class Emprunt implements Serializable {
    @Id
    @Column(name ="id_emprunt")
    private Integer id_emprunt ;

    @Column(name ="nom")
    private String nom;

    @Column(name ="date_debut")
    private Date date_debut;

    @Column(name ="date_fin")
    private Date date_fin;

    @Column(name ="quantite_emprunt")
    private Integer quantite_emprunt;

    @OneToMany(mappedBy="emprunt")
    private List<Type_document> type_documents;

    @OneToMany(mappedBy="emprunt")
    private List<User> users;

    @ManyToOne
    @JoinColumn(name = "id")
    private Historique historique;

}
