package com.ideas.aditya.customerApp.controller;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ideas.aditya.customerApp.entity.Customer;
import com.ideas.aditya.customerApp.service.CustomerService;

@Controller
public class MainController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String welcomePage() {
        return "home";
    }

    @GetMapping("/allCustomer")
    public String allCustomer(ModelMap modelMap) {
        modelMap.put("customers", customerService.findAll());
        return "allCustomer";
    }

    @GetMapping("/getCustomer")
    public String getCustomer(ModelMap modelMap) {
        return "getCustomer";
    }

    @PostMapping("/getCustomer")
    public String getCustomerCall(@RequestParam("name") String name, ModelMap modelMap) {

        modelMap.put("customers", customerService.findByName(name));
        return "allCustomer";
    }
    
    @GetMapping("/admin/saveCustomer")
    public String saveCustomer(ModelMap modelMap) {
        return "saveCustomer";
    }
    
    @PostMapping("/admin/saveCustomer")
    public String saveCustomerCall(@RequestParam("name") String name,@RequestParam("city") String city,@RequestParam("email") String email, ModelMap modelMap) {

        Customer customer = new Customer(name, email, city);
        
        modelMap.put("customers", Arrays.asList(customerService.saveCustomer(customer)));
        return "allCustomer";
    }
    
    @GetMapping("/admin/deleteCustomer")
    public String deleteCustomer(ModelMap modelMap) {
        return "deleteCustomer";
    }
    
    @PostMapping("/admin/deleteCustomer")
    public String deleteCustomerCall(@RequestParam("name") String name, ModelMap modelMap) {

        modelMap.put("customers", customerService.deleteCustomerByName(name));
        return "redirect:/allCustomer";
    }
}
