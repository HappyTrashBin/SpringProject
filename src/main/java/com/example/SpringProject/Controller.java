package com.example.SpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller extends UserServiceImpl {
    @GetMapping(value = "/v1/users/{id}")
    @ResponseBody
    public User getMethod(@PathVariable Integer id) {
        User user = getUser(id);
        return user;
    }
}
