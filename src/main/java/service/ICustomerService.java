package com.chengyu.amlewsbdl.service;

import com.chengyu.amlewsbdl.domain.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomerById(int id);
}