package com.example.dao;

import com.example.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> findAll();
}
