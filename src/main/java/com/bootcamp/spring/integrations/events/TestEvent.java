package com.bootcamp.spring.integrations.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bijoypaul on 05/07/17.
 */
public class TestEvent {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");
        AnonymousPublisher publisher = context.getBean(AnonymousPublisher.class);
        publisher.publish("Good afternoon...");
    }
}
