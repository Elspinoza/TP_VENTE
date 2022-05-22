package com.defitech.tpVente.repository;

import com.defitech.tpVente.modele.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteRepository extends JpaRepository<Vente,Integer> {
}
