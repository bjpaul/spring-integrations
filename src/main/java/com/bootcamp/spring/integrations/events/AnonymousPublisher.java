package com.bootcamp.spring.integrations.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by bijoypaul on 05/07/17.
 */
@Component
public class AnonymousPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(final String message) {
//        System.out.println(applicationEventPublisher.getClass());
        System.out.println("Greeting... "+message);
        GreetingEvent event = new GreetingEvent(this, message);
        applicationEventPublisher.publishEvent(event);
    }
}
