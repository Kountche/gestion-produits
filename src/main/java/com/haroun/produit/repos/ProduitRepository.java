package com.haroun.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haroun.produit.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
