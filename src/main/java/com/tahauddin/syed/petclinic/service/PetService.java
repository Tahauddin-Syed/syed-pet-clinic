package com.tahauddin.syed.petclinic.service;

import com.tahauddin.syed.petclinic.model.Pet;

import java.util.List;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    List<Pet> findAll();

}
