package com.currencies_backend.currencies_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currencies_backend.currencies_backend.model.Currency;
import com.currencies_backend.currencies_backend.service.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {
  @Autowired
  private CurrencyService currencyService;

  public ResponseEntity<List<Currency>> getAllCurrencies() {
    return ResponseEntity.ok(currencyService.getAllCurrencies());
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Currency> getCurrencyById(@PathVariable Long id) {
    return currencyService.getCurrencyById(id)
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }
}
