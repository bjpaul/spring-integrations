package com.bootcamp.spring.integrations.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by bijoypaul on 05/07/17.
 */
public class GreetingEvent extends ApplicationEvent{

    private String message;

    public GreetingEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
