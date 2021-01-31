package com.capstone.capstone.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capstone.capstone.model.Orders;

@Repository
public interface OrderDao extends CrudRepository<Orders, UUID>{

}
