package com.springreact.vendas.respositories;

import com.springreact.vendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
