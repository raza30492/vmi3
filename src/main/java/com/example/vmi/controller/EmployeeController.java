package com.example.vmi.controller;

import com.example.vmi.entity.Employee;
import com.example.vmi.service.EmployeeService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/emp"})
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(method = {RequestMethod.GET}, value = {"/signup"})
    public String signupShow(){
        System.out.println("signupShow");
        return "register";
    }
    
    @RequestMapping(method = {RequestMethod.POST}, value = {"/signup"})
    public String signup(HttpServletRequest request){
        System.out.println("signup");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Employee employee = new Employee(username, email, password);
        employee = employeeService.save(employee);
        if(employee != null && employee.getId() != null){
            request.setAttribute("message", "Employee Registered successfully!!!");
        }else{
            request.setAttribute("message", "Some error occured, Try again later!");
        }
        return "register";
    }
    
    @RequestMapping(method = {RequestMethod.GET}, value = {"/login"})
    public String loginShow(){
        System.out.println("loginShow");
        return "login";
    }
    
    @RequestMapping(method = {RequestMethod.POST}, value = {"/login"})
    public String login(HttpServletRequest request){
        System.out.println("login");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        Employee employee = employeeService.authenticate(email, password);
        if(employee != null){
            request.setAttribute("username", employee.getName());
            return "profile";
        }else{
            request.setAttribute("message", "Incorrect Email or Password!");
            return "login";
        }
    }
}
