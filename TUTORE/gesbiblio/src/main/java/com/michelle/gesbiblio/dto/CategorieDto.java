package com.michelle.gesbiblio.dto;

import com.michelle.gesbiblio.entity.Ouvrage;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class CategorieDto {

    private Integer id_cat;
    private String nom;
    private String libelle;
    private Integer quantite;
    private Ouvrage ouvrage;

}
