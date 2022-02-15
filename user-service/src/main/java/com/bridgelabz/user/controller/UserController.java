package com.bridgelabz.user.controller;

import com.bridgelabz.user.VO.ResponseTemplateVO;
import com.bridgelabz.user.entity.User;
import com.bridgelabz.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside Save User of User controller");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }


}
