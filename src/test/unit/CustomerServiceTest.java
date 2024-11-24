package com.chengyu.amlewsbdl.unit;

import com.chengyu.amlewsbdl.domain.Customer;
import com.chengyu.amlewsbdl.service.ICustomerService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

public class CustomerServiceTest {
    @Test
    public void testSaveCustomer() {
        ICustomerService customerService = mock(ICustomerService.class);
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setAccountBalance(new BigDecimal("1000.00"));
        customerService.saveCustomer(customer);

        verify(customerService).saveCustomer(customer);
    }
}