package com.example.zeynashop.repos;

import com.example.zeynashop.entities.Produit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
