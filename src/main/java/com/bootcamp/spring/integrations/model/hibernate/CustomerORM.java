package com.bootcamp.spring.integrations.model.hibernate;

import com.bootcamp.spring.integrations.model.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by bijoypaul on 04/07/17.
 */
@Entity
@Table(name = "customer")
public class CustomerORM extends Customer {

    public CustomerORM() {
        super();
    }

    public CustomerORM(long custId, String name, int age) {
        super(custId, name, age);
    }

    @Id
    @Column(name = "cust_id")
    @Override
    public Long getCustId() {
        return super.getCustId();
    }

    @Override
    public void setCustId(Long custId) {
        super.setCustId(custId);
    }

    @Column(name = "name")
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Column(name = "age")
    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }
}
