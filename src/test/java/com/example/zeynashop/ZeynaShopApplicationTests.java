package com.example.zeynashop;


import java.util.Date;
import java.util.List;

import com.example.zeynashop.entities.Categorie;
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
        Produit prod = new Produit("PS 5",2000.500,new Date());
        produitRepository.save(prod);
    }
    // rechercher un produit par son id
    @Test
    public void  testFindProduit()
    {
        Produit p=produitRepository.findById(3L).get();
        System.out.println(p);

    }



    // modifier produit
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


    @Test
    public void tesfindByNomProduitContains()
    {
        List<Produit> prods = produitRepository.findAllByNomProduit("hp");

        for (Produit p:prods)
            System.out.println(p);

    }

    @Test
    public void tesfindProduitbyNom()
    {
        List<Produit> prods = produitRepository.findAllByNomProduit("hp");

        for (Produit p:prods)
            System.out.println(p);

    }

    @Test
    public void testTrierProduitsNomsPrix()
    {
        List<Produit> prods = produitRepository.TrierProduitsNomsPrix();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void testfindByNomPrix()
    {
        List<Produit> prods = produitRepository.findByNomPrix("samsun", 1000.0);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }
    @Test
    public void testfindByCategorie()
    {
        Categorie cat = new Categorie();
        cat.setIdCat(1L);
        List<Produit> prods = produitRepository.findByCategorie(cat);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void findByCategorieIdCat()
    {
        List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }


}

