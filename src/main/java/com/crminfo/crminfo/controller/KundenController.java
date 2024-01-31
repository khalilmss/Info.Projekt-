package com.crminfo.crminfo.controller;

import com.crminfo.crminfo.entity.Kunden;
import com.crminfo.crminfo.service.KundenService;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/kunden")
public class KundenController {

    private KundenService kundenService;

    private EntityManager entityManager;

    public KundenController(KundenService kundenService) {
        this.kundenService = kundenService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public List<Kunden> all_kunde(){

        System.out.println("Get All");

        List<Kunden> all = kundenService.findAll();
        return all;
    }



    @CrossOrigin
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Kunden thekunden = new Kunden();

        theModel.addAttribute("kunden", thekunden);
        return "employees/kunden-form";
    }

    @CrossOrigin
    @PostMapping("/save")
    public Kunden savekunden(@RequestBody Kunden thekunde){
        thekunde.setId(0);
        kundenService.save(thekunde);
        System.out.println(" saved a new one Id: " + thekunde.getId() );
        return thekunde;
    }

    @CrossOrigin
    @DeleteMapping("/delete/{kudenId}")
    public String delete(@PathVariable int kudenId){
        Kunden kunden = kundenService.findById(kudenId);
        if (kunden == null){
            throw new RuntimeException("Kunde id not exist -> "  + kudenId);
        }
        kundenService.deleteById(kudenId);
        return "is deleted";
    }

    @CrossOrigin
    @PutMapping("/Update")
    public Kunden update(@RequestBody Kunden thekunde){

        Kunden new_Kunde = kundenService.save(thekunde);

        System.out.println(thekunde.getId() +"is updated");
        return new_Kunde;
    }



}


