package com.orion.greeting.service.service;

import com.orion.greeting.common.model.Greeting;

public interface GreetingService {
    Greeting sayGreeting(String userId, String greetingWords);
}
