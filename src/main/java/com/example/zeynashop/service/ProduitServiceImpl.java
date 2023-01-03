package com.example.zeynashop.service;

import com.example.zeynashop.entities.Categorie;
import com.example.zeynashop.entities.Produit;
import com.example.zeynashop.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitServiceImpl implements ProduitService{

	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit saveProduit(Produit p) {
		return null;
	}

	@Override
	public Produit updateProduit(Produit p) {
		return null;
	}

	@Override
	public void deleteProduit(Produit p) {

	}

	@Override
	public void deleteProduitById(Long id) {

	}

	@Override
	public Produit getProduit(Long id) {
		return null;
	}

	@Override
	public List<Produit> getAllProduits() {
		return null;
	}

	@Override
	public List<Produit> findByNomProduit(String nom) {
		return null;
	}

	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		return null;
	}


	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		return produitRepository.findByCategorie(categorie);
	}
	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		return produitRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		return null;
	}

	@Override
	public List<Produit> trierProduitsNomsPrix() {
		return null;
	}


}
