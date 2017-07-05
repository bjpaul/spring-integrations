package com.bootcamp.spring.integrations.model;


public class Customer
{
	Long custId;
	String name;
	Integer age;
	
	public Customer(){
	}

	public Customer(Long custId, String name, Integer age) {
		this.custId = custId;
		this.name = name;
		this.age = age;
	}

	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer {age=" + age + ", custId=" + custId + ", name=" + name
				+ "}";
	}
	
	
}
