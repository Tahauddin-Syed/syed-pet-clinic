package com.tahauddin.syed.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SPECIALITY")
public class Speciality extends BaseEntity{

    @Column(name="DESCRIPTION")
    private String description;


}
