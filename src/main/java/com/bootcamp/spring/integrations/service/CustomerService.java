package com.bootcamp.spring.integrations.service;

import com.bootcamp.spring.integrations.dao.CustomerDAO;


/**
 * Created by bijoypaul on 04/07/17.
 */
public class CustomerService {

    private CustomerDAO customerDAO;

    public void insert(){
        customerDAO.save(1001l, "Customer Name", 25);
    }

    public void fetch(){
        System.out.println(customerDAO.findByCustomerId(1001l));
    }

    public void delete(){
        customerDAO.delete(1001l);
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
}
