package com.michelle.gesbiblio.dto;

import com.michelle.gesbiblio.entity.Emprunt;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class HistoriqueDto {
    private Integer id;
    private Date date_emprunt;
    private List<EmpruntDto> emprunts;
}
