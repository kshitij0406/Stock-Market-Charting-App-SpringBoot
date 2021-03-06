package com.stockApp.Application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    
    String stockExchangeName, brief, contactAddress, remarks;
    
    
    public void equalto(StockExchange s){
        this.brief = s.brief;
        this.contactAddress = s.contactAddress;
        this.stockExchangeName = s.stockExchangeName;
        this.remarks = s.remarks;
    }
    
}
