package spring.basic.security.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
    @GetMapping("/getMsg")
    public String greeting(){
        System.out.println("hit by client");
        return "spring security example";

    }
    
}
