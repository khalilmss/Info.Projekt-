package com.crminfo.crminfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){

//        return "employees/plain-login";
        return "employees/fancy-login";
    }

    //add request mapping for /acces-denied
    @GetMapping("/access-denied")
    public String showAccessDenied(){

        return "employees/access-denied";
    }
}
