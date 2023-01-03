package com.example.zeynashop;


import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.zeynashop.entities.Produit;
import com.example.zeynashop.repos.ProduitRepository;


@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    //tester ajout d'un nouveau produit
    public void testCreateProduit() {
        Produit prod = new Produit("HP",4500.500,new Date());
        produitRepository.save(prod);
    }
    // rechercher un produit par son id
    @Test
    public void  testFindProduit()
    {
        Produit p=produitRepository.findById(3L).get();
        System.out.println(p);

    }


    @Test
    public void testUpdateProduit()
    {
        Produit p = produitRepository.findById(2L).get();
        p.setPrixProduit(2000.0);
        produitRepository.save(p);

        System.out.println(p);
    }

    @Test
    public void testDeleteProduit()

    {
        produitRepository.deleteById(3L);
    }

    @Test
    public void testFindAllProduits()
    {
        List<Produit> prods = produitRepository.findAll();

        for (Produit p:prods)
            System.out.println(p);

    }

}

