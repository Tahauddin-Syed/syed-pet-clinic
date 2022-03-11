package com.tahauddin.syed.petclinic.controller;

import com.tahauddin.syed.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets", "/vet"})
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"/","",  "/index.html", "/index"})
    public String vetList(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "Vet/index";
    }
}
