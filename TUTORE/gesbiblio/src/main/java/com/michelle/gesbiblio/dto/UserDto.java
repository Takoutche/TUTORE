package com.michelle.gesbiblio.dto;

import com.michelle.gesbiblio.entity.Emprunt;
import com.michelle.gesbiblio.entity.Notification;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {

    private Integer id_user ;
    private String Nom;
    private String email;
    private String password;
    private String role;
    private EmpruntDto emprunt;
    private NotificationDto notification;
}
