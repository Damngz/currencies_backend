package com.currencies_backend.currencies_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currencies_backend.currencies_backend.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {}
