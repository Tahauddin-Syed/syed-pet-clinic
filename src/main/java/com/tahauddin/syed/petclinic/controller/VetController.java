package com.tahauddin.syed.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/vets", "/vet"})
public class VetController {

    @GetMapping({"/","",  "/index.html", "/index"})
    public String vetList(){

        return "Vet/index";
    }
}
