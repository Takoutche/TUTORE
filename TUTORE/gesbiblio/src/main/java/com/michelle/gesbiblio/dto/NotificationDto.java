package com.michelle.gesbiblio.dto;

import com.michelle.gesbiblio.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class NotificationDto {
    private Integer id_notif;
    private String message;
    private String type_notif;
    private String titre;
    private Date date_notif;
    private List<UserDto> user;
}


