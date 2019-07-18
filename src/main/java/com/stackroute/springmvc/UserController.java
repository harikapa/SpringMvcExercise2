package com.stackroute.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController  {

    @RequestMapping(path = "/authorize", method = RequestMethod.POST)
    public String authorize(Model model, User user){

        System.out.println("Username:"+user.getUsername()+" Password:"+user.getPassword());
        model.addAttribute("user",user);
        return "display";
    }
}
