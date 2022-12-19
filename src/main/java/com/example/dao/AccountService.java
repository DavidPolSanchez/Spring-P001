package com.example.dao;

public class AccountService {
    CustomerDAO customerDAO;

    public AccountService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "AccountService{" +
                "customerDAO=" + customerDAO +
                '}';
    }
}
