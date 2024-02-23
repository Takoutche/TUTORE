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
@Table(name ="user")

public class User implements Serializable {
    @Id
    @Column(name ="id_user")
    private Integer id_user ;

    @Column(name ="Nom")
    private String Nom;

    @Column(name ="email")
    private String email;

    @Column(name ="password")
    private String password;

    @Column(name ="role")
    private String role;



    @ManyToOne
    @JoinColumn (name = "id_doc")
    private Emprunt emprunt;

    @ManyToOne
    @JoinColumn(name = "id_notif")
    private Notification notification;

}
