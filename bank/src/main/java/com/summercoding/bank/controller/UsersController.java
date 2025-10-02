package com.summercoding.bank.controller;


import com.summercoding.bank.business.UsersManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @Autowired
    UsersManager usersManager;


}
