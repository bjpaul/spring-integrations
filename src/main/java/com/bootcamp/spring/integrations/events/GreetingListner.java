package com.bootcamp.spring.integrations.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by bijoypaul on 05/07/17.
 */
@Component
public class GreetingListner implements ApplicationListener<GreetingEvent> {

    @Override
    public void onApplicationEvent(GreetingEvent event) {
        System.out.println("Received spring event - " + event.getMessage());
    }
}
