package com.hussainabdelilah.postgretest.postgrespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String sayHello() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("Hussain");
        userRepository.save(user);
        return "Hello";
    }

}
