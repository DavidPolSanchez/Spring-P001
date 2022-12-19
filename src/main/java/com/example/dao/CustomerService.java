package com.example.dao;

public class CustomerService {

//    CustomerDAOJpaImpl customerDAO = new CustomerDAOJpaImpl();
    CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
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
        return "CustomerService{" +
                "customerDAO=" + customerDAO +
                '}';
    }
}
