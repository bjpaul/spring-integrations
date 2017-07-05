package com.bootcamp.spring.integrations;

import com.bootcamp.spring.integrations.dao.CustomerDAO;
import com.bootcamp.spring.integrations.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bijoypaul on 04/07/17.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");

        CustomerService customerService = context.getBean(CustomerService.class);

        customerService.insert();
        customerService.fetch();
//        customerService.delete();
    }
}
