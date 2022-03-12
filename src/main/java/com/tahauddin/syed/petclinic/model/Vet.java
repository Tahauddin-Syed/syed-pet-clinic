package com.tahauddin.syed.petclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Speciality> specialities;

    public Vet(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

    public Vet(String firstName, String lastName, Set<Speciality> specialities) {
        super(firstName, lastName);
        this.specialities = specialities;
    }

    public Vet() {
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
