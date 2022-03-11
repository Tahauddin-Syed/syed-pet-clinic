package com.tahauddin.syed.petclinic.bootstrap;

import com.tahauddin.syed.petclinic.model.Owner;
import com.tahauddin.syed.petclinic.model.Vet;
import com.tahauddin.syed.petclinic.service.OwnerService;
import com.tahauddin.syed.petclinic.service.VetService;
import com.tahauddin.syed.petclinic.service.map.OwnerServiceMap;
import com.tahauddin.syed.petclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner ownerOne = new Owner();
        ownerOne.setId(1L);
        ownerOne.setFirstName("Micheal");
        ownerOne.setLastName("Weston");

        Owner ownerTwo = new Owner();
        ownerTwo.setId(2L);
        ownerTwo.setFirstName("Micheal");
        ownerTwo.setLastName("Weston");

        ownerService.save(ownerOne);
        ownerService.save(ownerTwo);

        Vet vetOne = new Vet();
        vetOne.setId(1L);
        vetOne.setFirstName("Sam");
        vetOne.setLastName("Axe");

        Vet vetTwo = new Vet();
        vetTwo.setId(2L);
        vetTwo.setFirstName("Sam");
        vetTwo.setLastName("Axe");

        vetService.save(vetOne);
        vetService.save(vetTwo);

        System.out.println("Data Loaded..");

    }
}
