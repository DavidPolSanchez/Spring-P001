package com.example;

import com.example.dao.AccountService;
import com.example.dao.CustomerDAO;
import com.example.dao.CustomerDAOJpaImpl;
import com.example.dao.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        Greeting greeting = new Greeting("hola mundo");
        System.out.println(greeting);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Greeting greeting1 = (Greeting) context.getBean("greeting1");
        System.out.println(greeting1);
        Greeting greeting2 = (Greeting) context.getBean("greeting2");
        System.out.println(greeting2);

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);

        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println(customerService);

        AccountService accountService = (AccountService) context.getBean("accountService");
        System.out.println(accountService);

        CustomerDAOJpaImpl customerDAO = (CustomerDAOJpaImpl) context.getBean("customerDAOJpa");
        System.out.println(customerDAO);

        String helloWorld = (String) context.getBean("helloWorldString");
        System.out.println(helloWorld);

    }
}
