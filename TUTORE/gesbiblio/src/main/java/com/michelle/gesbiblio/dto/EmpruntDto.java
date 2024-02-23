package com.michelle.gesbiblio.dto;

import com.michelle.gesbiblio.entity.Historique;
import com.michelle.gesbiblio.entity.Type_document;
import com.michelle.gesbiblio.entity.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class EmpruntDto {
    private Integer id_emprunt ;
    private String nom;
    private Date date_debut;
    private Date date_fin;
    private Integer quantite_emprunt;
    private List<Type_documentDto> type_documents;
    private List<UserDto> users;
    private HistoriqueDto historique;
}
