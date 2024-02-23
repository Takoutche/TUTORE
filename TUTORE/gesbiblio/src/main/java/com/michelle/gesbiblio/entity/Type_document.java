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
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="type_doc")
public class Type_document implements Serializable {
    @Id
    @Column(name ="id_doc")
    private Integer id_doc;

    @Column(name ="type_doc")
    private String type_doc;

    @Column(name ="quantite_doc")
    private Integer quantite_doc;

    @ManyToOne
    @JoinColumn(name = "id_ouvrage")
    private Ouvrage ouvrage;

    @ManyToOne
    @JoinColumn(name = "id_emprunt")
    private Emprunt emprunt;
}
