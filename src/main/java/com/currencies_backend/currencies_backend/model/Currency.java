package com.currencies_backend.currencies_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CURRENCIES")
public class Currency {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long currency_id;

  @Column(nullable = false, unique = true)
  private String key_id;

  @Column(nullable = false)
  private String description;

  @Column(nullable = false)
  private String measurement;

  @Column(nullable = false)
  private String dolar;

  @Column(nullable = false)
  private String name;

  @Column()
  private String photo_url;

  public Long getCurrency_id() {
    return currency_id;
  }

  public void setCurrency_id(Long currency_id) {
    this.currency_id = currency_id;
  }

  public String getKey_id() {
    return key_id;
  }

  public void setKey_id(String key_id) {
    this.key_id = key_id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public String getDolar() {
    return dolar;
  }

  public void setDolar(String dolar) {
    this.dolar = dolar;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoto_url() {
    return photo_url;
  }

  public void setPhoto_url(String photo_url) {
    this.photo_url = photo_url;
  }
}
