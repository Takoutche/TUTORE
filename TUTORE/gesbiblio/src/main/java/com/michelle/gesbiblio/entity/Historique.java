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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "historique")


public class Historique implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "date_emprunt")
    private Date date_emprunt;

    @OneToMany(mappedBy = "historique")
    private List<Emprunt> emprunts;
}


