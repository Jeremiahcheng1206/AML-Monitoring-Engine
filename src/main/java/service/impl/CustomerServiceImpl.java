package com.chengyu.amlewsbdl.service.impl;

import com.chengyu.amlewsbdl.domain.Customer;
import com.chengyu.amlewsbdl.mapper.CustomerMapper;
import com.chengyu.amlewsbdl.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getAllCustomers() {
        return customerMapper.selectAllCustomers();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerMapper.updateCustomer(customer);
    }

    @Override
    public void deleteCustomerById(int id) {
        customerMapper.deleteCustomer(id);
    }
}