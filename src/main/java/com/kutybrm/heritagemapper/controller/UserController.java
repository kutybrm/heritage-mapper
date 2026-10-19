package com.kutybrm.heritagemapper.controller;

import com.kutybrm.heritagemapper.entity.User;
import com.kutybrm.heritagemapper.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // Tüm kullanıcıları listeleyen GET Endpoint'i
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Yeni kullanıcı oluşturan POST Endpoint'i
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}