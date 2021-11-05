package com.springreact.vendas.dto;

import java.io.Serializable;

import com.springreact.vendas.entities.Seller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SellerDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(){}

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
