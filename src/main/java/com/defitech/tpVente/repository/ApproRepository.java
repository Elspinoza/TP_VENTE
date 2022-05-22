package com.defitech.tpVente.repository;

import com.defitech.tpVente.modele.Appro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApproRepository extends JpaRepository<Appro, Integer> {
}
