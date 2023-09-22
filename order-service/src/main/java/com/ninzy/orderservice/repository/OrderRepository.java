package com.ninzy.orderservice.repository;

import com.ninzy.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{
}
