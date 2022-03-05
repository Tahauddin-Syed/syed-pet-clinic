package com.tahauddin.syed.petclinic.service;

import com.tahauddin.syed.petclinic.model.Vet;

import java.util.List;

public interface VetService {
    
    Vet findById(Long id);
    
    Vet save(Vet vet);

    List<Vet> findAll();
}
