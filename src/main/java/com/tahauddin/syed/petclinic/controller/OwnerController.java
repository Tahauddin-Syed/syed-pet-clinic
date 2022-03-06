package com.tahauddin.syed.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/owner", "/owners"})
public class OwnerController {


    @GetMapping({"/", "", "/index", "/index.html"})
    public String ownerList(){

        return "Owner/index";
    }

}
