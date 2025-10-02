package com.summercoding.bank.repositories;

import com.summercoding.bank.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
