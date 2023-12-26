package com.crminfo.crminfo.controller;

import com.crminfo.crminfo.entity.Kontakt_history;
import com.crminfo.crminfo.entity.Kunden;
import com.crminfo.crminfo.service.KundenService;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/kunden")
public class KundenController {

    private KundenService kundenService;

    private EntityManager entityManager;

    public KundenController(KundenService kundenService) {
        this.kundenService = kundenService;
    }

    @GetMapping("/all")
    public String all_kunde(Model theModel){
        System.out.println("testtttttttttttt");
        Kunden all1 = kundenService.findById(1);
        List<Kunden> all = kundenService.findAll();
        createkundenwithcomment(kundenService);
//      System.out.println(all.getKontakt_history());

//        System.out.println(all.getKontakt_history().get(1));
        System.out.println(all1.getFamilienstand());
        System.out.println(all1.getFirst_name());
        System.out.println(all1.getLast_name());
        System.out.println(all1.getGeburtsdatum());
        System.out.println(all1.getLast_name());
        System.out.println(all1.getStaatangehörigkeit());
        List<Kontakt_history> kh = all1.getKontakt_history();
        for(Kontakt_history s : kh){
            System.out.println(s.getComment() + "####" + s.getDatum() );
        }
//
//        System.out.println("jetzt");
//         createkundenwithcomment(kundenService);
//        System.out.println(all.getKontakt_history());
//        kundenService.save(all);
        System.out.println("theeeeeeeeeeeeFetch");
//         retrieveKundenAndComment(kundenService);
//
        theModel.addAttribute("all", all);
        return "employees/list-kunden";
    }

    //    @{/employees/delete(employeeId=${tempEmployee.id})}
    @GetMapping("/konakths")
    public String kontakhs(@RequestParam("kundenId") int theId, Model theModel ){
        Kunden all = kundenService.findById(theId);
        List<Kontakt_history> test = all.getKontakt_history();
        theModel.addAttribute("k_h", test);
        return "employees/k_h";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Kunden thekunden = new Kunden();

        theModel.addAttribute("kunden", thekunden);
        return "employees/kunden-form";
    }

    @PostMapping("/save")
    public String savekunden(@ModelAttribute("kunden") Kunden thekunde){

        kundenService.save(thekunde);
        return  "kunden/all";
    }

    @GetMapping("/Update")
    public String showFormForUpdate(@RequestParam("kundenId")int theId, Model theModel){
        // get kunden by the Id
        Kunden thekunden = kundenService.findById(theId);
        System.out.println(thekunden.getLast_name());
        // set die kunde to theModel

        theModel.addAttribute("Kunden", thekunden);

        return "employees/kunden-form";

    }

    public void  createkundenwithcomment(KundenService kundenService){
        Kunden test = kundenService.findById(1);
        test.addkontakt(new Kontakt_history("heute muss das Problem behoben werden", LocalDate.now()));
    }

    public Kunden retrieveKundenAndComment(KundenService kundenService){

        Kunden kunden = kundenService.findKundenAndCommentByKundenId(1);

        System.out.println(kunden);

        System.out.println(kunden.getKontakt_history());

//        TypedQuery<Kunden> query = entityManager.createQuery(
//                "SELECT c from Kunden c "
//                        + "JOIN FETCH c.kontakt_history "
//                        + "where c.Id = :data", Kunden.class);
//
//        query.setParameter("data", 1);
//
//        // execute query
//        Kunden theKunden = query.getSingleResult();

        return kunden;

    }
}


