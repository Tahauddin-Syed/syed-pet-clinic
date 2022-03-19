package com.tahauddin.syed.petclinic.model;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name="VET")
public class Vet extends Person{

    @ManyToMany(fetch = EAGER)
    @JoinTable(name="VET_SPECIALITIES",
            joinColumns = @JoinColumn(name="vet_id"),
            inverseJoinColumns = @JoinColumn(name="speciality_id"))
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
