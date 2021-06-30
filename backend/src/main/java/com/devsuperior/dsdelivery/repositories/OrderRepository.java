package com.devsuperior.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdelivery.endities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
