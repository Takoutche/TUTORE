package com.michelle.gesbiblio.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Type_documentDto {

    private Integer id_doc;
    private String type_doc;
    private Integer quantite_doc;
    private OuvrageDto ouvrage;
    private EmpruntDto emprunt;
}
