package com.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onetomany.dto.OrderRequest;
import com.onetomany.dto.OrderResponse;
import com.onetomany.entity.Customer;
import com.onetomany.repository.CustomerRepository;

@Service
public class OrderService {
	    
	    @Autowired
	    CustomerRepository customerRepository;
	    public Customer placeOrder(OrderRequest request){
	       return customerRepository.save(request.getCustomer());
	    }

	   
	    public List<Customer> findAllOrders(){
	        return customerRepository.findAll();
	    }

	    
	    public List<OrderResponse> getJoinInformation(){
	        return customerRepository.getJoinInformation();
	    }

}
