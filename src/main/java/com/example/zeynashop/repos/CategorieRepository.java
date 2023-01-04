package com.example.zeynashop.repos;

import com.example.zeynashop.entities.Categorie;
import com.example.zeynashop.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
