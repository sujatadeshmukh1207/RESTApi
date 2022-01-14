package com.sujata.BankAppRestApi.Dao;

import org.springframework.data.repository.CrudRepository;

import com.sujata.BankAppRestApi.Model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
