package com.summercoding.bank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class Users {
    @Id
    long idUser;
    String firstName;
    String lastName;
    String email;
    String phone;
    String address;
    String gender;
    String password;

}
