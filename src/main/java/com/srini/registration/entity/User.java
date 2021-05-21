package com.srini.registration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_registration")
public class User {

    @Id
    @GeneratedValue
    private  int id;
    private String name;
    private String email;
    private int experience;
    private String domain;

}
