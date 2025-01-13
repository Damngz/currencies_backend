package com.currencies_backend.currencies_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currencies_backend.currencies_backend.model.User;
import com.currencies_backend.currencies_backend.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    return ResponseEntity.ok(userService.getAllUsers());
  }

  @GetMapping("/{email}")
  public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
    return userService.getUserByEmail(email)
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }
}
