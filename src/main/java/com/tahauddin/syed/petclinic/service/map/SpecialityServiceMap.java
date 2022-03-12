package com.tahauddin.syed.petclinic.service.map;

import com.tahauddin.syed.petclinic.model.Speciality;
import com.tahauddin.syed.petclinic.model.Vet;
import com.tahauddin.syed.petclinic.service.SpecialityService;
import com.tahauddin.syed.petclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
