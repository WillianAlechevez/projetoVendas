package com.springreact.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.springreact.vendas.dto.SellerDTO;
import com.springreact.vendas.entities.Seller;
import com.springreact.vendas.respositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
