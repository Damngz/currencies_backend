package com.currencies_backend.currencies_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "FAVORITE_CURRENCIES")
public class Favorites {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long favorite_id;

  @ManyToOne
  @JoinColumn(name = "USER_ID", nullable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "CURRENCY_ID", nullable = false)
  private Currency currency;

  public Long getFavorite_id() {
    return favorite_id;
  }

  public void setFavorite_id(Long favorite_id) {
    this.favorite_id = favorite_id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
}
