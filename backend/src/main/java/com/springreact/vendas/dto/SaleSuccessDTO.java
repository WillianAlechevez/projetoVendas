package com.springreact.vendas.dto;

import java.io.Serializable;

import com.springreact.vendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SaleSuccessDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(){}

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}

