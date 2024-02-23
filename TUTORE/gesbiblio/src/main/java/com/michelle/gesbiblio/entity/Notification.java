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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name ="notification")

public class Notification  implements Serializable {
    @Id
    @Column (name ="id_notif")
    private Integer id_notif;

    @Column(name ="message")
    private String message;

    @Column(name ="type_notif")
    private String type_notif;

    @Column(name ="titre")
    private String titre;

    @Column(name ="date_notif")
    private Date date_notif;


    @OneToMany(mappedBy="notification")
    private List<User> user;
}
