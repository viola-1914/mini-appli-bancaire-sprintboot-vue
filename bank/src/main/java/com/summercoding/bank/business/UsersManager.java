package com.summercoding.bank.business;

import com.summercoding.bank.entities.Users;
import com.summercoding.bank.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersManager {
    @Autowired
    UsersRepository usersRepository;

    public void createUser(String firstName, String password
                            , String lastName, String email
                            , String phone, String address
                            , String gender    ) {

        Users user = new Users();
        user .setFirstName(firstName);
        user .setLastName(lastName);
        user .setEmail(email);
        user .setPhone(phone);
        user .setAddress(address);
        user .setGender(gender);
        user .setPassword(password);

        usersRepository.save(user);
    }

    public Users getUserById(Long idUser) {
        return usersRepository.findById(idUser).orElseThrow();
    }
}
