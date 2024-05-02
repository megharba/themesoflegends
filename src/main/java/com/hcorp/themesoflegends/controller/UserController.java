package com.hcorp.themesoflegends.controller;

import com.hcorp.themesoflegends.dto.UserDto;
import com.hcorp.themesoflegends.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public UserDto createUser(@RequestParam("name") String userName, @RequestParam("password") String userPassword) {
        return this.userService.createUser(userName, userPassword);
    }

    @PostMapping("/connect")
    public UserDto connectUser(@RequestParam("name") String userName, @RequestParam("password") String userPassword) {
        return this.userService.connectUser(userName, userPassword);
    }
}
