package com.thymeleaf.demo.controller;

import com.thymeleaf.demo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class EmployeeController {
    private List<Employee> employees;

    @PostConstruct
    public void loadData(){
        Employee emp1 = new Employee(1, "Ahmed", "Elsheikh","a@a.com");
        Employee emp2  = new Employee(2, "Saad" ,"Ali" ,"s@s.com");
        Employee emp3 = new Employee(3, "Hany" ,"Rashad", "h@h.com");

        employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
    }

    @GetMapping("/employees")
    public String showEmployees(Model model){
        model.addAttribute("theEmployees", employees);
        return "list-employees";

    }

}
