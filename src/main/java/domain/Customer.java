package com.chengyu.amlewsbdl.domain;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Customer {
    private Integer customerId;
    private String name;
    private String address;
    private String email;
    private BigDecimal accountBalance;
    private String phoneNumber;
}