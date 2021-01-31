package com.capstone.capstone.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.capstone.capstone.model.Order_Inventory;

public interface OIDao extends CrudRepository<Order_Inventory, UUID> {

}
