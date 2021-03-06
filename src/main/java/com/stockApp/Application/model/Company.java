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
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    
    String companyName, ceo, boardOfDirectors, stockexchange;
    
    
    public void equalto(Company c) {
        this.boardOfDirectors = c.boardOfDirectors;
        this.ceo = c.ceo;
        this.companyName = c.companyName;
        this.stockexchange = c.stockexchange;
    }
}
