package com.example.dao;

import com.example.Customer;

import java.util.List;

public class CustomerDAOJpaImpl implements CustomerDAO{

    public CustomerDAOJpaImpl(){
        System.out.println("Creando bean CustomerDAOJpaImpl");
    }
    @Override
    public List<Customer> findAll() {
        return null;
    }
}
