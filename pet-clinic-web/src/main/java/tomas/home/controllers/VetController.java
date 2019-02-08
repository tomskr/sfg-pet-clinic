package tomas.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tomas.home.sfgpetclinic.services.VetServices;

@Controller
public class VetController {
    private final VetServices vetServices;

    public VetController(VetServices vetServices) {
        this.vetServices = vetServices;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetServices.findAll());
        return "vets/index";
    }
}
