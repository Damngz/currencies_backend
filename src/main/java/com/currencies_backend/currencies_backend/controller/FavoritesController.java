package com.currencies_backend.currencies_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currencies_backend.currencies_backend.model.Favorites;
import com.currencies_backend.currencies_backend.service.FavoritesService;
import com.currencies_backend.currencies_backend.service.UserService;

@RestController
@RequestMapping("/favorites")
@CrossOrigin("http://localhost:4200")
public class FavoritesController {
  @Autowired
  private FavoritesService favoritesService;

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<List<Favorites>> getAllFavorites() {
    return ResponseEntity.ok(favoritesService.getAllFavorites());
  }

  @GetMapping("/user/{userId}")
  public ResponseEntity<List<Favorites>> getFavoritesByUser(@PathVariable Long userId) {
    return userService.getUserById(userId)
      .map(user -> ResponseEntity.ok(favoritesService.getFavoritesByUser(user)))
      .orElse(ResponseEntity.notFound().build());
  }
}
