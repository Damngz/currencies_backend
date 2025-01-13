package com.currencies_backend.currencies_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencies_backend.currencies_backend.model.Favorites;
import com.currencies_backend.currencies_backend.model.User;
import com.currencies_backend.currencies_backend.repository.FavoritesRepository;

@Service
public class FavoritesService {
  @Autowired
  private FavoritesRepository favoritesRepository;

  public FavoritesService(FavoritesRepository favoritesRepository) {
    this.favoritesRepository = favoritesRepository;
  }

  public List<Favorites> getAllFavorites() {
    return favoritesRepository.findAll();
  }

  public List<Favorites> getFavoritesByUser(User user) {
    return favoritesRepository.findByUser(user);
  }

  public Favorites addFavorite(Favorites favorite) {
    return favoritesRepository.save(favorite);
  }

  public void deleteFavorite(Long id) {
    favoritesRepository.deleteById(id);
  }
}
