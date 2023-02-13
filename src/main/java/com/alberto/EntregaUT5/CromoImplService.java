package com.alberto.EntregaUT5;

import com.alberto.EntregaUT5.model.Cromo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CromoImplService implements CromoService{
    @Autowired
    CromoRepository cr;
    public List<Cromo> findAll() {
        return (List<Cromo>)cr.findAll();
    }

    public Optional<Cromo> findById(Long id) {
        return cr.findById(id);
    }

    public void saveCromo(Cromo cromo) {
        cr.save(cromo);
    }

    public Cromo updateCromo(Long id, Cromo cromo) {
        if(cr.findById(id).isPresent())
            cr.save(cromo);
        return null;
    }

    public void deleteCromo(Long id) {
        cr.deleteById(id);
    }
}
