package com.stockApp.Application.repository;

import com.stockApp.Application.model.StockExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer> {

}
