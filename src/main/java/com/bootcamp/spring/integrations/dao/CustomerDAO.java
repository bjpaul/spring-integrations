package com.bootcamp.spring.integrations.dao;

import com.bootcamp.spring.integrations.model.Customer;

public interface CustomerDAO 
{
	void save(Long custId, String name, Integer age);

	Customer findByCustomerId(Long custId);

	void delete(Long custId);
}




