
package com.myprj.mvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {
    
    @RequestMapping("/welcome")
    public String home(Model model){
        
        
        model.addAttribute("param","User");
        
        return "home";
    }
    
}
