package com.tahauddin.syed.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="VISIT")
public class Visit extends BaseEntity{

    @Column(name="date")
    private LocalDate date;

    @Column(name="DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;


}
