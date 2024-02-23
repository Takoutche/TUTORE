package com.michelle.gesbiblio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class OuvrageRequestDto {
    private Integer id_ouvrage;
    private String nom;
    private String auteur;
    private Integer quantite;
    private String description;
    private Date date_publication;
    private List<CategorieDto> categories;
    private List<Type_documentDto>Type_documents;


    }
