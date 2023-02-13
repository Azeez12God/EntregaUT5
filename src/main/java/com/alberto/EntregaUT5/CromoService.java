package com.alberto.EntregaUT5;

import com.alberto.EntregaUT5.model.Cromo;

import java.util.List;
import java.util.Optional;

public interface CromoService {
    List<Cromo> findAll();
    Optional<Cromo> findById(Long id);
    void saveCromo(Cromo cromo);
    Cromo updateCromo(Long id, Cromo cromo);
    void deleteCromo(Long id);
}
