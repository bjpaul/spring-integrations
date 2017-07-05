package com.bootcamp.spring.integrations.dao.impl;

import com.bootcamp.spring.integrations.dao.CustomerDAO;
import com.bootcamp.spring.integrations.model.hibernate.CustomerORM;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateCustomerDAO implements CustomerDAO {

	private SessionFactory sessionFactory;

	public HibernateCustomerDAO(){
	}

	//save example
	public void save(Long custId, String name, Integer age){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(new CustomerORM(custId, name, age));
		session.getTransaction().commit();
		session.close();

	}

	//query single row with RowMapper
	public CustomerORM findByCustomerId(Long custId){

		Session session = sessionFactory.openSession();
		CustomerORM customer = session.get(CustomerORM.class, custId);
		session.close();
		return customer;
	}

	@Override
	public void delete(Long custId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		CustomerORM customer = findByCustomerId(custId);
		session.delete(customer);
		session.getTransaction().commit();
		session.close();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
