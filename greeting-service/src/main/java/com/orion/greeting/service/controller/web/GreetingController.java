package com.orion.greeting.service.controller.web;

import com.orion.greeting.common.model.Greeting;
import com.orion.greeting.service.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@Slf4j
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/user/{userId}/{greetingWords}")
    public Greeting greetingToUser(@PathVariable String userId, @PathVariable String greetingWords) {
        log.info("Greeting to [{}] with [{}]", userId, greetingWords);
        return greetingService.sayGreeting(userId, greetingWords);
    }
}
