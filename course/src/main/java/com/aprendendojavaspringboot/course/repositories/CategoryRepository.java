package com.aprendendojavaspringboot.course.repositories;

import com.aprendendojavaspringboot.course.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

