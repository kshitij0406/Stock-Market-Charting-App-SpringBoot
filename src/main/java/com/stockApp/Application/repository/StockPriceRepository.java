package com.stockApp.Application.repository;

import com.stockApp.Application.model.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockPriceRepository extends JpaRepository <StockPrice,Integer>{

}
