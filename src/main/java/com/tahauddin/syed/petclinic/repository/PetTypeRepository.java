package com.tahauddin.syed.petclinic.repository;

import com.tahauddin.syed.petclinic.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {

}
