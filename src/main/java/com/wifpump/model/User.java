package com.wifpump.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // <- Kennzeichnet eine Klasse als Entität
@Table(name = "users") // Hibernate Config, Tabelle Users zu verwenden
public class User {

    @Id // <- Primary Key
    @Column(name = "user_id")
    private Long id;
    private String username;
/*    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private String street;
    private String city;
    private Long zip_code;
    private String country;

*/

    //GETTER

    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    //SETTER

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
