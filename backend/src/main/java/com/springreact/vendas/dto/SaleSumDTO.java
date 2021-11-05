package com.springreact.vendas.dto;

import java.io.Serializable;

import com.springreact.vendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SaleSumDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(){}

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}

