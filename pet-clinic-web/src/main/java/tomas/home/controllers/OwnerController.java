package tomas.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tomas.home.sfgpetclinic.services.OwnerServices;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    private final OwnerServices ownerServices;

    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners",ownerServices.findAll());
        return "owners/index";
    }
}
