package com.crminfo.crminfo.controller;

import com.crminfo.crminfo.entity.Employee;
import com.crminfo.crminfo.service.EmployeeService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }


    // add mapping for "list"
    @GetMapping("/list")
    public String listEmployee(Model theModel){

        List<Employee> one = employeeService.findAll();

        List<Employee> theEmployees = one.stream()
                .filter(Employee ->Employee.getStatus().equals("activ"))
                .collect(Collectors.toList());

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        //create model attribute to bind from data
        Employee theEmployee = new Employee();

        theEmployee.setStatus("toactive");
        theEmployee.setId_creator(
                SecurityContextHolder
                        .getContext()
                        .getAuthentication()
                        .getName()
        );

        theModel.addAttribute("employee", theEmployee);
        return "employees/employee-form";
    }


    @GetMapping("showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){

        //get the employee from the service
        Employee theEmployee = employeeService.findById(theId);

        // set the employee in the model to prepopulate the form
        theModel.addAttribute("employee",theEmployee);

        //send over to our form
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){

        LocalDateTime ldt = LocalDateTime.now();
        theEmployee.setCr_date(ldt);

        LocalDateTime ex_dt = ldt.plusMonths(3);
        theEmployee.setEx_date(ex_dt);

        if(theEmployee.getStatus() == "toactive"){
           //save the employee
            employeeService.save(theEmployee);
        }

        if(theEmployee.getStatus() == "activ"){

            employeeService.save(theEmployee);
            System.out.println(theEmployee.getStatus());
        }

        else{
            employeeService.save(theEmployee);
        }
        return "redirect:/employees/list";

    }


    @GetMapping("/toactive")
    public String toactive(Model themodel){

        List<Employee> theEmployees = employeeService.findAll();

        List<Employee> toAct = theEmployees.stream()
                .filter( Employee -> (Employee.getStatus().equals("toactive")
                        || Employee.getStatus().equals("todelete"))&& !Employee.getId_creator().equals( SecurityContextHolder
                        .getContext()
                        .getAuthentication()
                        .getName()))
                .collect(Collectors.toList());

        themodel.addAttribute("toactive", toAct);

        return "employees/list-toactiv";
    }


    @GetMapping("/activation")
    public String activation(@RequestParam("employeeId") int theId, Model theModel){

        Employee theEmployee = employeeService.findById(theId);

        if( theEmployee.getStatus().equals("toactive")){
            theEmployee.setStatus("activ");
            employeeService.save(theEmployee);
        }

        if(theEmployee.getStatus().equals("todelete")){
            employeeService.deleteById(theId);
        }

        List<Employee> one = employeeService.findAll();

        List<Employee> theEmployees = one.stream()
                .filter( Employee -> Employee.getStatus().equals("activ"))
                .collect(Collectors.toList());


        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/rejection")
    public String rejection(@RequestParam("employeeId") int theId, Model theModel){

        // to we still need logic for rejection
        return null;
    }

    @GetMapping("/delete")
    public String delete (@RequestParam("employeeId") int theId, Model theModel){

        Employee theEmployee = employeeService.findById(theId);
        theEmployee.setStatus("todelete");
        theEmployee.setId_creator(
                SecurityContextHolder
                        .getContext()
                        .getAuthentication()
                        .getName()
        );

        employeeService.save(theEmployee);

        //delete the employee
        //employeeService.deleteById(theId);
        //theModel.addAttribute("employees", theEmployees);
        //redirect to the /employee/list
        return "redirect:/employees/list";
    }

//    @GetMapping("/leaders")
//    public String showLeaders(){    return "/employees/list";}
//    @GetMapping("/systems")
//    public String showSystems(){
//
//        return "/employees/systems";
//    }

}
