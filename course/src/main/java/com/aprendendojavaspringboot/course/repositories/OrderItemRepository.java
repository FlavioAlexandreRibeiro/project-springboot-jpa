package com.aprendendojavaspringboot.course.repositories;

import com.aprendendojavaspringboot.course.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
