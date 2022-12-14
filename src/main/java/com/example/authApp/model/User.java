package com.example.authApp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    private String userName;
    private String password;

}
