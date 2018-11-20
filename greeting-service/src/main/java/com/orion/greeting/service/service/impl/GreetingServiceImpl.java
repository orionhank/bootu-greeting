package com.orion.greeting.service.service.impl;

import com.orion.greeting.common.model.Greeting;
import com.orion.greeting.service.service.GreetingService;
import com.orion.user.common.model.UserInfo;
import com.orion.user.service.client.feign.UserServiceClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private UserServiceClient userServiceClient;

    @Override
    public Greeting sayGreeting(String userId, String greetingWords) {
        Greeting greeting = new Greeting();
        List<UserInfo> userInfoList = userServiceClient.getUserList();
        for (UserInfo userinfo : userInfoList) {
            if (userinfo.getUserId().equals(userId)) {
                BeanUtils.copyProperties(userinfo, greeting);
                greeting.setGreetingWords(greetingWords);
            }
        }
        return greeting;
    }
}
