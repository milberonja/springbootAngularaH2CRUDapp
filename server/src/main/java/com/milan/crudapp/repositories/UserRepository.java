package com.milan.crudapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milan.crudapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
