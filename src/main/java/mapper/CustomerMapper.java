package com.chengyu.amlewsbdl.mapper;

import com.chengyu.amlewsbdl.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> selectAllCustomers();
    void insertCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}