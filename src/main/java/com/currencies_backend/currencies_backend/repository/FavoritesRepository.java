package com.currencies_backend.currencies_backend.repository;
import com.currencies_backend.currencies_backend.model.Currency;
import com.currencies_backend.currencies_backend.model.Favorites;
import com.currencies_backend.currencies_backend.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritesRepository extends JpaRepository<Favorites, Long> {
  List<Favorites> findByUser(User user);
  List<Favorites> findByCurrency(Currency currency);
}
