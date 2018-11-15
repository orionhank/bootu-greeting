package com.orion.greeting.service.service;

import com.orion.greeting.common.model.Greeting;

public interface GreetingService {
    public Greeting sayGreeting(String UserId, String GreetingWords);
}
