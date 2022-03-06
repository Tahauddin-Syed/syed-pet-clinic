package com.tahauddin.syed.petclinic.service;

import com.tahauddin.syed.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
