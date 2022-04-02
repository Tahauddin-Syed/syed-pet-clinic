package com.tahauddin.syed.petclinic.controller;

import com.tahauddin.syed.petclinic.model.Owner;
import com.tahauddin.syed.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/owner", "/owners"})
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"/", "", "/index", "/index.html"})
    public String ownerList(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "Owner/index";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findOwnerById(@PathVariable("id") Long ownerId){
        ModelAndView modelAndView = new ModelAndView("Owner/ownerDetails");
        Owner ownerById = ownerService.findById(ownerId);
        modelAndView.addObject(ownerById);
        return modelAndView;
    }
}
