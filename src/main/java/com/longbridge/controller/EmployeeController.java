package com.longbridge.controller;

import com.longbridge.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class EmployeeController {

    /*
    * Fetching a params for the url
    * use @ModelAttribute
    * to send the Employee Type to the created form
    * */
    @GetMapping({"/", "/addEmp"})
    public String getEmpForm(@ModelAttribute("emp")Employee emp){
        return "empForm";
    }

    /*
    * Recieves the Employee type
    * Using @ModelAttribute feature,
    * Can The save it to a DB
    * Also Used the RedirectAttributes to addFlashAttribute to another page
    * */
    @PostMapping("/addEmp")
    public String saveEmp(@Valid @ModelAttribute("emp") Employee emp, BindingResult result, RedirectAttributes ra) {
//        Save to DB
        if(result.hasErrors()){
            return "empForm";
        }
        System.out.println(emp);
        ra.addFlashAttribute("savedEmployee", emp);
        return "redirect:/detail";
    }

    /*
    * Calls a New Page Redirected To After Form Submission
    * */
    @GetMapping("/detail")
    public String detail() {
        return "empDetail";
    }
}
