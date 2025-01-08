package com.onetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onetomany.dto.OrderResponse;
import com.onetomany.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	   @Query("SELECT new com.onetomany.dto.OrderResponse(c.name , p.productName,p.price) FROM Customer c JOIN c.products p")
	    public List<OrderResponse> getJoinInformation();
	}