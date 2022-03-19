package com.tahauddin.syed.petclinic.repository;

import com.tahauddin.syed.petclinic.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
