package com.tahauddin.syed.petclinic.bootstrap;

import com.tahauddin.syed.petclinic.model.Owner;
import com.tahauddin.syed.petclinic.model.PetType;
import com.tahauddin.syed.petclinic.model.Vet;
import com.tahauddin.syed.petclinic.service.OwnerService;
import com.tahauddin.syed.petclinic.service.PetTypeService;
import com.tahauddin.syed.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner ownerOne = new Owner();
        ownerOne.setId(1L);
        ownerOne.setFirstName("Micheal");
        ownerOne.setLastName("Weston");
        ownerOne.setAddress("St.Petersburg");
        ownerOne.setCity("St.PetersBurg");
        ownerOne.setTelephone("123456789");

        Owner ownerTwo = new Owner();
        ownerTwo.setId(2L);
        ownerTwo.setFirstName("Micheal");
        ownerTwo.setLastName("Weston");
        ownerTwo.setAddress("St.Petersburg");
        ownerTwo.setCity("St.Petersburg");
        ownerTwo.setTelephone("123456789");

        ownerService.save(ownerOne);
        ownerService.save(ownerTwo);

        Vet vetOne = new Vet();
        vetOne.setId(1L);
        vetOne.setFirstName("Sam");
        vetOne.setLastName("Axe");

        Vet vetTwo = new Vet();
        vetTwo.setId(2L);
        vetTwo.setFirstName("John");
        vetTwo.setLastName("Gate");

        vetService.save(vetOne);
        vetService.save(vetTwo);

        System.out.println("Data Loaded..");

    }
}
