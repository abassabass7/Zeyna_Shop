package com.example.zeynashop.service;

import com.example.zeynashop.entities.Produit;
import com.example.zeynashop.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProduitServiceImpl implements ProduitService{

	@Autowired
	ProduitRepository produitRepository;

	@Override
	public Produit saveProduit(Produit p) {

		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p)
	{
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);

	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);

	}

	@Override
	public Produit getProduit(Long id)
	{
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {

		return produitRepository.findAll();
	}

}