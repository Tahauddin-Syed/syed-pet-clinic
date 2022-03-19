package com.tahauddin.syed.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="VET")
public class Vet extends Person{

    @ManyToMany(fetch = EAGER)
    @JoinTable(name="VET_SPECIALITIES",
            joinColumns = @JoinColumn(name="vet_id"),
            inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> specialities;


}
