package com.wifpump.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity // <- Kennzeichnet eine Klasse als Entität
@Data // <- Lombok erzeugt Getter / Setter / toString / equals / Hash
@Table(name = "users") // Hibernate Config, Tabelle Users zu verwenden
public class User {

    @Id // <- Primary Key
    @Column(name = "user_id")
    private Long id;
    private String username;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private String street;
    private String city;
    private Long zip_code;
    private String country;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Double weight;
    private Double height;
    private String goal;
}
