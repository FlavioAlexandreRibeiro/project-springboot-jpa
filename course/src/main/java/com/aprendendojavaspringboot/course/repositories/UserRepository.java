package com.aprendendojavaspringboot.course.repositories;

import com.aprendendojavaspringboot.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
