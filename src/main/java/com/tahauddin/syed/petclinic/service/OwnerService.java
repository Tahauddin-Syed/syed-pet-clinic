package com.tahauddin.syed.petclinic.service;

import com.tahauddin.syed.petclinic.model.Owner;

import java.util.List;

public interface OwnerService {

    Owner findByLastName(String lastName);
    
    Owner findById(Long id);

    Owner save(Owner owner);

    List<Owner> findAll();
}
