package com.claytoncalixto.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claytoncalixto.dsdeliver.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {
}
