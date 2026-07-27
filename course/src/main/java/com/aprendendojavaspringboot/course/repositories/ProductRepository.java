package com.aprendendojavaspringboot.course.repositories;

import com.aprendendojavaspringboot.course.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

