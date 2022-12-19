package com.example.dao;

import com.example.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

// @Component
public class CustomerDAOJdbcImpl implements CustomerDAO{
    @Override
    public List<Customer> findAll() {
        System.out.println("CustomerDAOJdbcImpl");
        return null;
    }
}
