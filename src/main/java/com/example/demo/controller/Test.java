package com.example.demo.controller;

import com.example.demo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @RequestMapping(name = "info", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public User index(@RequestBody User user) {
        logger.debug(user.toString());
        return user;
    }
}
