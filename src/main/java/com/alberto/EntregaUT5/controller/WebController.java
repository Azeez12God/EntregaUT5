package com.alberto.EntregaUT5.controller;

import com.alberto.EntregaUT5.CromoImplService;
import com.alberto.EntregaUT5.model.Cromo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController {
    @Autowired
    private CromoImplService cis;

    // CRUD: C
    @PostMapping("/alta")
    public void altaEmpleado(Cromo cromo)
    {
        cis.saveCromo(cromo);
    }

    // R
    @GetMapping("/cromos")
    public List<Cromo> listaCromos()
    {
        return cis.findAll();
    }

    //U
    @PutMapping("/cromos/{id}")
    public Cromo actualizaEmpleado(@PathVariable Long id, Cromo cromo)
    {
        return cis.updateCromo(id,cromo);
    }

    //D
    @DeleteMapping("/cromos({id}")
    public void borraCromo(@PathVariable Long id)
    {
        cis.deleteCromo(id);
    }
}
