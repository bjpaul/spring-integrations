package com.bootcamp.spring.integrations.dao.impl;


import com.bootcamp.spring.integrations.dao.CustomerDAO;
import com.bootcamp.spring.integrations.model.Customer;
import com.bootcamp.spring.integrations.model.CustomerRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcCustomerDAO implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	//save example
	public void save(Long custId, String name, Integer age){

		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

		jdbcTemplate.update(sql, new Object[] { custId,
					name,age
		});

	}

	//query single row with RowMapper
	public Customer findByCustomerId(Long custId){
		 
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
 
		Customer customer = jdbcTemplate.queryForObject(
				sql, new Object[] { custId }, new CustomerRowMapper());
	
		return customer;
	}

	@Override
	public void delete(Long custId) {
		String sql = "DELETE FROM CUSTOMER " +
				"WHERE CUST_ID = ?";

		jdbcTemplate.update(sql, new Object[] { custId});

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
