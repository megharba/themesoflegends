package com.hcorp.themesoflegends.controller;

import com.hcorp.themesoflegends.dto.UserDto;
import com.hcorp.themesoflegends.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public UserDto createUser(@RequestParam("name") String userName, @RequestParam("email") String userEmail, @RequestParam("password") String userPassword) {
        return this.userService.createUser(userName, userEmail, userPassword);
    }

    @PutMapping("/change-avatar")
    public UserDto updateAvatar(@RequestParam("uid") String userUid, @RequestParam("avatar") String newAvatar) {
        return this.userService.updateAvatar(userUid, newAvatar);
    }

    @PutMapping("/change-password")
    public UserDto updatePassword(@RequestParam("uid") String userUid, @RequestParam("password") String newPassword) {
        return this.userService.updatePassword(userUid, newPassword);
    }

    @PostMapping("/connect")
    public UserDto connectUser(@RequestParam("name") String userName, @RequestParam("password") String userPassword) {
        return this.userService.connectUser(userName, userPassword);
    }
}
